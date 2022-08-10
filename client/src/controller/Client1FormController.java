package controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

public class Client1FormController implements Initializable {
    public TextArea textarea;
    public TextField txtmsg;
    public Label lblname;

    static Socket socket = null;
    static DataInputStream dataInputStream;
    static DataOutputStream dataOutputStream;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
      new Thread(new Runnable() {
          @Override
          public void run() {
              try {
                  socket=new Socket("localhost",5000);
                  dataInputStream=new DataInputStream(socket.getInputStream());
                  dataOutputStream=new DataOutputStream(socket.getOutputStream());

                  String messageIn = "";

                  while (!messageIn.equals("end")){
                      messageIn=dataInputStream.readUTF();
                      textarea.appendText("\nServer :"+messageIn.trim()+"\n");
                  }
              } catch (IOException e) {
                  throw new RuntimeException(e);
              }
          }
      }).start();
    }
    public void sendbtn(ActionEvent actionEvent) throws IOException {
        String reply = "";
        reply=txtmsg.getText();
        textarea.appendText(("\t\t\t\t\t\t\t\tmalith:" +reply.trim()));
        dataOutputStream.writeUTF(reply);
        txtmsg.setText("");
    }
}
