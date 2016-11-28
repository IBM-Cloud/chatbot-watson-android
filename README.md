# WatBot
is an IBM Watson powered ChatBot running on Android and using Conversation Service on IBM Bluemix (an open standards, cloud platform for building, running, and managing apps and services).

<p align="center"><img src="https://github.com/VidyasagarMSC/WatBot/blob/initial/Images/WatBot.png" width="350"></p>


## Creation of Conversation Service

Watson Conversation combines a number of cognitive techniques to help you build and train a bot - defining intents and entities and crafting dialog to simulate conversation.

![Watson Conversation Service Overview](https://github.com/VidyasagarMSC/WatBot/blob/initial/Images/Watson_Conversation_Service.png)

### Getting started
<p>Before you can start using the Conversation service, you must log in to IBM® Bluemix® and create a service instance.</p>
<ol>
<li>Log in to Bluemix and navigate to the Conversation service:
<ul>
<li>Don’t have Bluemix account? <a target="_blank" href="https://console.ng.bluemix.net/registration/?target=/catalog/services/conversation/" title="(Opens in a new tab or window)">Sign up</a> to create a free trial account.</li>
<li>Have a Bluemix account? Use <a target="_blank" href="https://console.ng.bluemix.net/catalog/services/conversation" title="(Opens in a new tab or window)">this link</a>.</li>
</ul>
</li>
<li>In the <strong>Service name</strong> field, type a unique name for your new instance of the Conversation service.
Check the “Pricing Plans” for data limits for the Conversation service</li>
<li>Click <strong>Create</strong>. You’ll see details about your new instance in the “Service Details” page.</li>
</ol>

### Creating a Workspace
You use the Conversation tool to create workspaces. You can either create a new workspace from scratch, or you can import a workspace from a JSON file. You can also duplicate an existing workspace within the same service instance.

<ol>
<li>If the Service Details page is not already open, click your Conversation service instance on the Bluemix console. (When you create a service instance, the Service Details page displays.)</li>
<li>On the “Service Details” page, scroll down to <strong>Conversation tooling</strong> and click <strong>Launch tool</strong>.</li>
<li>Click <strong>Create</strong> to create a new workspace.</li>
<li>Specify the details for the new workspace:
<ul>
<li><strong>Name</strong>: A name no more than 64 characters in length. This value is required.</li>
<li><strong>Description</strong>: A description no more than 128 characters in length.</li>
<li><strong>Language</strong>: The language of the user input the workspace will be trained to understand. The service supports Brazilian Portuguese, English, French, Italian, and Spanish.</li>
</ul>
</li>
<li>Click <strong>Create</strong>. The new workspace is created and now appears as a tile on the Workspaces page.</li>
</ol>


<h3>Creating an intent </h3>
<p>You use the Conversation tool to create intents. The number of intents and examples you can create in a single service instance depends on your Conversation service plan:</p>

<p>Create some intents.</p>
<ol>
<li>
<p>In the Conversation tool, open your workspace and then click the <strong>Intents</strong> tab.</p>
</li>
<li>
<p>Click <strong>Create new</strong>.</p>
</li>
<li>
<p>In the Intent name field, type a descriptive name for the intent. The intent name can contain letters (in Unicode), numbers, underscores, hyphens, and dots. Intent names cannot contain spaces and must not exceed 128 characters. The following are examples of intent names:</p>
<ul>
<li><code>#weather_conditions</code></li>
<li><code>#pay_bill</code></li>
<li><code>#escalate_to_agent</code></li>
</ul>
<p><strong>Tip</strong>: Don’t include the <code>#</code> character in the intent names when you create them in the Conversation tool.</p>
</li>
<li>
<p>In the <strong>User example</strong> field, type the text of a user example for the intent. An example can be any string up to 1024 characters in length. The following might be examples for the <code>#pay_bill</code> intent:</p>
<ul>
<li><code>I need to pay my bill.</code></li>
<li><code>Pay my account balance</code></li>
<li><code>make a payment</code></li>
</ul>
<p><strong>Important</strong>: Intent names and example text can be exposed in URLs when an application interacts with the service. Do not include sensitive or personal information in these artifacts.</p>
<p>Press Enter or click <strong>+</strong> to save the example.</p>
</li>
<li>
<p>Repeat the same process to add more examples. Provide at least 5 examples for each intent. The more examples you provide, the more accurate your application can be.</p>
<p align="center"><img src="https://github.com/VidyasagarMSC/WatBot/blob/initial/Images/define_intent.png" alt="Screen capture showing intent definition"></p>
</li>
<li>
<p>When you have finished adding examples, click <strong>Create</strong> to finish creating the intent.</p>
</li>
</ol>
<h3>Results</h3>
<p>The intent you created is added to the Intents tab, and the system begins to train itself on the new data.</p>
<p>You can click any intent in the list to open it for editing. You can make the following changes:</p>
<ul>
<li>Rename the intent.</li>
<li>Delete the intent.</li>
<li>Add, edit, or delete examples.</li>
<li>Move an example to a different intent.</li>
</ul>
<p>To move an example, select the example by clicking the check box and then click <strong>Move to</strong>.</p>
<p align="center"><img src="https://github.com/VidyasagarMSC/WatBot/blob/initial/Images/move_example.png" alt="Screen capture showing how to move an example"></p>

<h3>Testing your intents </h3>
<p>After you have finished creating new intents, you can test the system to see if it recognizes your intents as you expect.</p>
<ol>
<li>
<p>In the Conversation tool, click the <img src="https://github.com/VidyasagarMSC/WatBot/blob/initial/Images/ask_watson.png" alt="Ask Watson"> icon.</p>
</li>
<li>
<p>In the Try it out panel, enter a question or other text string and press Enter to see which intent is recognized. If the wrong intent is recognized, you can improve your model by adding this text as an example to the correct intent.</p>
<p><strong>Tip</strong>: If you have recently made changes in your workspace, you might see a message indicating that the system is still retraining. If you see this message, wait until training completes before testing:</p>
<p align="center"><img src="https://github.com/VidyasagarMSC/WatBot/blob/initial/Images/training.png" alt="Screen capture showing retraining message"></p>
<p>The response indicates which intent was recognized from your input.</p>
<p align="center"><img src="https://github.com/VidyasagarMSC/WatBot/blob/initial/Images/test_intents.png" alt="Screen capture of testing intents"></p>
</li>
<li>
<p>If the system did not recognize the correct intent, you can correct it. To correct the recognized intent, click the displayed intent and then select the correct intent from the list. After your correction is submitted, the system automatically retrains itself to incorporate the new data.</p>
<p align="center"><img src="https://github.com/VidyasagarMSC/WatBot/blob/initial/Images/correct_intent.png" alt="Screen capture of correcting a recognized intent"></p>
<p>If your intents are not being correctly recognized, consider making the following kinds of changes:</p>
<ul>
<li>Add the unrecognized text as an example to the correct intent.</li>
<li>Move existing examples from one intent to another.</li>
<li>Consider whether your intents are too similar, and redefine them as appropriate.</li>
</ul>
</li>
</ol>

<h3>Creating an entity </h3>
<p>You use the Conversation tool to create entities. The number of entities, entity values, and synonyms you can create in a single service instance depends on your Conversation service plan:</p>
<ol>
<li>
<p>In the Conversation tool, open your workspace and then click the <strong>Entities</strong> tab.</p>
</li>
<li>
<p>Click <strong>Create new</strong>.</p>
</li>
<li>
<p>In the <strong>Add the entity name</strong> field, type a descriptive name for the entity.</p>
<p>The entity name can contain letters (in Unicode), numbers, underscores, and hyphens. For example:</p>
<ul>
<li><code>@location</code></li>
<li><code>@menu_item</code></li>
<li><code>@product</code></li>
</ul>
<p><strong>Tips</strong>:</p>
<ul>
<li>Don’t include the <code>@</code> character in the entity names when you create them in the Conversation tool.</li>
<li>Entity names can’t contain spaces or be longer than 64 characters. And entity names can’t begin with the string <code>sys-</code>, which is reserved for system entities.</li>
</ul>
</li>
<li>
<p>In the <strong>Value</strong> field, type the text of a possible value for the intent. An entity value can be any string up to 64 characters in length.</p>
<p><strong>Important</strong>: Don’t include sensitive or personal information in entity names or values. The names and values can be exposed in URLs in an app.</p>
</li>
<li>
<p>In the <strong>Synonyms</strong> field, type any synonyms for the entity value. A synonym can be any string up to 64 characters in length. Press Enter to save each synonym.</p>
<p><img src="https://github.com/VidyasagarMSC/WatBot/blob/initial/Images/define_entity.png" alt="Screen capture of defining an entity"></p>
</li>
<li>
<p>Click <strong>+</strong> and repeat the process to add more entity values.</p>
</li>
<li>
<p>When you are finished adding values and synonyms, click <strong>Create</strong>.</p>
</li>
</ol>
### Building a Dialog
The dialog component of the Conversation service uses the intents and entities that are identified in the user’s input to gather required information and provide a useful response. Your dialog is represented graphically as a tree; create a branch to process each intent that you define.

 Post branching Intents and entities, this is how my Conversation Dialog on Bluemix looks like

![Conversation Service on Bluemix](https://github.com/VidyasagarMSC/WatBot/blob/initial/Images/Conversation_Service_Bluemix.png)

<strong>Note:</strong>If you just want to configure the app talking to Watson Conversation Service using <a href="https://github.com/watson-developer-cloud/java-sdk" target="_blank">Watson Developer Cloud Java SDK</a> and skip other in-depth Android coding details, Jump to [Configure the App](https://github.com/VidyasagarMSC/WatBot/tree/master#configure-the-app)
## Coding the app on Android Studio
Android Studio is the Official IDE for Android. Android Studio provides the fastest tools for building apps on every type of Android device.

<a href="https://github.com/VidyasagarMSC/WatBot/archive/initial.zip" target="_blank">Click here</a> to download the starter code (.Zip). UnZip the code to a folder.

## Importing the code to Android Studio
* Start Android Studio and close any open Android Studio projects.
* From the Android Studio menu click File > New > Import Project.
  * Alternatively, from the Welcome screen, click Open an existing Android Studio Project

![Android Studio Import](https://github.com/VidyasagarMSC/WatBot/blob/initial/Images/Screen%20Shot%202016-11-23%20at%209.53.06%20PM.png)

* Navigate to the folder where the code is downloaded and click OK

<p align="center"> <img src="https://github.com/VidyasagarMSC/WatBot/blob/initial/Images/Screen%20Shot%202016-11-23%20at%209.54.45%20PM.png" width="350"></p>

* Once gradle build is successful, Click Project on the left pane and navigate to **Gradle Scripts -> build.gradle(Module: app)** and check the <strong>dependencies</strong> for following dependencies.

```
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    androidTestCompile('com.android.support.test.espresso:espresso-core:2.2.2', {
        exclude group: 'com.android.support', module: 'support-annotations'
    })
    compile 'com.android.support:appcompat-v7:24.2.1'
    compile 'com.android.support:recyclerview-v7:24.1.1'
    compile 'com.android.support:design:24.1.1'
    compile 'com.squareup.okhttp3:okhttp:3.4.2'
    compile 'com.google.code.gson:gson:2.8.0'
    compile 'com.ibm.watson.developer_cloud:conversation:3.5.1'
    testCompile 'junit:junit:4.12'

}
```
<p> Do a gradle build </p>

* Once gradle build is successful, Click Project on the left pane and navigate to app -> java

* Go to the com.example.vmac.watbot - > MainActivity

   <p>Replace the existing code with,</p>

   ```
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
        private ChatAdapter mAdapter;
        private ArrayList messageArrayList;
        private EditText inputMessage;
        private ImageButton btnSend;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            inputMessage = (EditText) findViewById(R.id.message);
            btnSend = (ImageButton) findViewById(R.id.btn_send);

            recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

            messageArrayList = new ArrayList<>();

            mAdapter = new ChatAdapter(messageArrayList);

            LinearLayoutManager layoutManager = new LinearLayoutManager(this);
            layoutManager.setStackFromEnd(true);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(mAdapter);

            btnSend.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    sendMessage();
                }
            });
        };

        @Override
        protected void onPause() {
            super.onPause();
        }

        /**
         * Handling new push message, will add the message to
         * recycler view and scroll it to bottom
         * */
        private void handlePushNotification(Intent intent) {
            String chatRoomId = intent.getStringExtra("chat_room_id");
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
            service.setUsernameAndPassword("<username>", "<password>");

            MessageRequest newMessage = new MessageRequest.Builder().inputText(inputmessage).build();
            MessageResponse response = service.message("<workspace_Id>", newMessage).execute();
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
              }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

            thread.start();
        }
    }
   ```

* Right click on com.example.vmac.watbot package and select New -> Java Class and name it as <strong>Message</strong>

   <p>Add the Following code to the class,</p>

   ```
    import java.io.Serializable;

    public class Message implements Serializable {
        String id, message;

        public Message() {
        }

        public Message(String id, String message, String createdAt) {
            this.id = id;
            this.message = message;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

   ```

* Right click on com.example.vmac.watbot package and select New -> Java Class and name it as <strong>ChatAdapter</strong>

  <p>Add the following code to the class,</p>

  ```
    import android.support.v7.widget.RecyclerView;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.TextView;

    import java.util.ArrayList;

    public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        private int SELF = 100;
        private ArrayList<Message> messageArrayList;

        public class ViewHolder extends RecyclerView.ViewHolder {
            TextView message;

            public ViewHolder(View view) {
                super(view);
                message = (TextView) itemView.findViewById(R.id.message);
            }
        }

        public ChatAdapter(ArrayList<Message> messageArrayList) {
            this.messageArrayList=messageArrayList;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView;

            // view type is to identify where to render the chat message
            // left or right
            if (viewType == SELF) {
                // self message
                itemView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.chat_item_self, parent, false);
            } else {
                // WatBot message
                itemView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.chat_item_watson, parent, false);
            }
            return new ViewHolder(itemView);
        }

        @Override
        public int getItemViewType(int position) {
            Message message = messageArrayList.get(position);
            if (message.getId().equals("1")) {
                return SELF;
            }

            return position;
        }

        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
            Message message = messageArrayList.get(position);
            message.setMessage(message.getMessage());
            ((ViewHolder) holder).message.setText(message.getMessage());
            }

        @Override
        public int getItemCount() {
                return messageArrayList.size();
        }
    }
  ```

## Configure the App

  <p>To configure  the App you need to get the Watson Conversation service <strong>Username</strong>, <strong>PassWord</strong> and <strong>WorkSpaceId</strong></p>

* In the <strong>MainActivity</strong> class locate the function named <strong>sendMessage()</strong>.

   ```
     ConversationService service = new ConversationService(ConversationService.VERSION_DATE_2016_09_20);

     service.setUsernameAndPassword("Your Watson service UserName", "Your watson service PassWord");

     MessageRequest newMessage = new MessageRequest.Builder().inputText(inputmessage).build();

     MessageResponse response = service.message("Your Workspace Id", newMessage).execute();
   ```

* Go to the Conversation service , and select the <strong>Service Credentials</strong> tab. Select <strong>password</strong> and <strong>username</strong>.

![Conversation Credentials](https://github.com/VidyasagarMSC/WatBot/blob/initial/Images/usernamePassword.png)

 </p>Add the `password` and `username` in the following code,</p>

 ```
 service.setUsernameAndPassword("<username>", "<password>");

 ```

* Next is to get the <strong>workspace Id</strong>.

<p>Launch the conversation service workspace and from the options select the <strong>View details</strong>.</p>

<p align="center">
<img src="https://github.com/VidyasagarMSC/WatBot/blob/initial/Images/workspace1.png" width="350"> 
<img src="https://github.com/VidyasagarMSC/WatBot/blob/initial/Images/workspace2.png" width="350">
</p>

<p>Get the <strong>Workspace ID:</strong> and add it in the below code,</p>

```
MessageResponse response = service.message("workspace_Id", newMessage).execute();
```

* Build and Run your app.

## Chat with your own WatBot 

If you have followed all the above instructions, you should be happily chatting with your Wat(son)Bot. 

** Remember your bot will be talking to your Conversation Service (Intents, Entities and Dialog).**

To learn more about Conversation and Other Watson Cognitive Services, <a href="https://www.ibm.com/watson/developercloud/" target="_blank">Click Here</a>

### Don't stop here!!! Keep coding and using Bluemix

