package com.example.vmac.chatbot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.ibm.watson.developer_cloud.conversation.v1.ConversationService;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageRequest;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    private String chatRoomId;
    private RecyclerView recyclerView;
    private ChatRoomThreadAdapter mAdapter;
    private ArrayList messageArrayList;
    //private BroadcastReceiver mRegistrationBroadcastReceiver;
    private EditText inputMessage;
    private ImageButton btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        inputMessage = (EditText) findViewById(R.id.message);
        btnSend = (ImageButton) findViewById(R.id.btn_send);


        //getSupportActionBar().setTitle(title);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       /* if (chatRoomId == null) {
            Toast.makeText(getApplicationContext(), "Chat room not found!", Toast.LENGTH_SHORT).show();
            finish();
        }*/

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

         messageArrayList = new ArrayList<>();

        // self user id is to identify the message owner
        // String selfUserId = MyApplication.getInstance().getPrefManager().getUser().getId();

        mAdapter = new ChatRoomThreadAdapter(this,messageArrayList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setStackFromEnd(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);


        // mRegistrationBroadcastReceiver = new BroadcastReceiver() {
        // @Override
            /*public void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals(Config.PUSH_NOTIFICATION)) {
                    // new push message is received
                    handlePushNotification(intent);
                }
            }*/
        btnSend.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                sendMessage();
            }
        });
    };


        /*btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage();
            }
        });

        fetchChatThread();
    }


    @Override
    protected void onResume() {
        super.onResume();
        //CHANGED
        // registering the receiver for new notification
       /* LocalBroadcastManager.getInstance(this).registerReceiver(mRegistrationBroadcastReceiver,
                new IntentFilter(Config.PUSH_NOTIFICATION));

        NotificationUtils.clearNotifications();*/


    @Override
    protected void onPause() {
        // LocalBroadcastManager.getInstance(this).unregisterReceiver(mRegistrationBroadcastReceiver);
        super.onPause();
    }

    /**
     * Handling new push message, will add the message to
     * recycler view and scroll it to bottom
     * */
    private void handlePushNotification(Intent intent) {
        //Message message = (Message) intent.getSerializableExtra("message");
        String chatRoomId = intent.getStringExtra("chat_room_id");

        //CHANGED
       /* if (message != null && chatRoomId != null) {
            messageArrayList.add(message);
            mAdapter.notifyDataSetChanged();
            if (mAdapter.getItemCount() > 1) {
                recyclerView.getLayoutManager().smoothScrollToPosition(recyclerView, null, mAdapter.getItemCount() - 1);
            }
        }*/
    }

    /**
     * Posting a new message in chat room
     * will make an http call to our server. Our server again sends the message
     * to all the devices as push notification
     * */
    private void sendMessage() {
        final String inputmessage = this.inputMessage.getText().toString().trim();
        Message inputMessage = new Message();
        inputMessage.setMessage(inputmessage);
        inputMessage.setId("1");
        messageArrayList.add(inputMessage);
        this.inputMessage.setText("");
        mAdapter.notifyDataSetChanged();

        Thread thread = new Thread(new Runnable(){
            public void run() {
                try {

        ConversationService service = new ConversationService(ConversationService.VERSION_DATE_2016_09_20);
        service.setUsernameAndPassword("c2f33c1e-aa31-4a5d-8ee1-a453a21e28f8", "K2wgQmt38ZBO");

        MessageRequest newMessage = new MessageRequest.Builder().inputText(inputmessage).build();
        MessageResponse response = service.message("f2a5bc02-886b-423b-bc92-5946a8c6f034", newMessage).execute();
        System.out.println(response);
        Message outMessage=new Message();
          if(response!=null)
          {
              if(response.getOutput()!=null && response.getOutput().containsKey("text"))
              {

                  final String outputmessage = response.getOutput().get("text").toString().replace("[","").replace("]","");
                  System.out.println("responsedIN" + outputmessage);
                  outMessage.setMessage(outputmessage);
                  outMessage.setId("2");
                  messageArrayList.add(outMessage);
              }
              else
              {
                  outMessage.setMessage("Please check your network connectivity");
                  outMessage.setId("2");
                  messageArrayList.add(outMessage);
              }
              runOnUiThread(new Runnable() {
                  public void run() {
                      mAdapter.notifyDataSetChanged();
                     if (mAdapter.getItemCount() > 1) {
                          recyclerView.getLayoutManager().smoothScrollToPosition(recyclerView, null, mAdapter.getItemCount()-1);

                      }

                  }
              });

              /*JsonParser jsonParser = new JsonParser();

              JsonElement jsonTree = jsonParser.parse(response.getText().toString());
              if(jsonTree.isJsonObject()) {
                  System.out.println("I Am JSON");
                  JsonObject jsonObject = jsonTree.getAsJsonObject();
                  JsonElement convOutput= jsonObject.get("output");
                  System.out.println(convOutput);
              }*/
          }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();

        /*if (mAdapter.getItemCount() > 1) {
            recyclerView.getLayoutManager().smoothScrollToPosition(recyclerView, null, mAdapter.getItemCount()-1);

        }*/

    }




}

