package com.example.client;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {
    PrintWriter writer=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void connect(View view) {
        EditText addr = findViewById(R.id.addr);
        String ipAddr = addr.getText().toString();
        new Thread(new Runnable() {
            BufferedReader reader=null;
            @Override
            public void run() {
                try {
                    Socket socket = new Socket(ipAddr, 7777);
                    OutputStream out=socket.getOutputStream();
                    InputStream in=socket.getInputStream();
                    writer = new PrintWriter(out, true);
                    reader=new BufferedReader(new InputStreamReader(in));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                while(true) {
                    try {
                        String msg = reader.readLine();
                        TextView conv = findViewById(R.id.conv);
                        conv.post(new Runnable() {
                            @Override
                            public void run() {
                                String msgPrev = conv.getText().toString();
                                conv.setText(msgPrev + msg);
                            }
                        });
                    } catch (IOException e) {
                        return;
                    }
                }
            }
        }).start();
        findViewById(R.id.connect).setEnabled(false);
    }

    public void send(View view){
        EditText msg = findViewById(R.id.msg);
        String msgStr = msg.getText().toString();
        Log.d("msg",msgStr);
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (writer != null)
                    writer.println(msgStr);
            }
        }).start();
    }
}