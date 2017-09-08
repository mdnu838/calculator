package nizam.com.cal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calc extends AppCompatActivity {


    Button b1 , b2 , b3 , b4 , b5 , b6 , b7 , b8 , b9 ,b0 ,bAC ,bc ,bdot ,bd ,bm ,bs ,ba ,bp,be;
    TextView txv,bup;
    char op='+';
    String num="", num2="0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        b1 = (Button) findViewById(R.id.a1);
        b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    num=txv.getText().toString();
                    
                    txv.setText(num+"1");

                }
        });
        txv = (TextView) findViewById(R.id.textView);
        b0 = (Button) findViewById(R.id.a0);
        b2 = (Button) findViewById(R.id.a2);
        b3 = (Button) findViewById(R.id.a3);
        b4 = (Button) findViewById(R.id.a4);
        b5 = (Button) findViewById(R.id.a5);
        b6 = (Button) findViewById(R.id.a6);
        b7 = (Button) findViewById(R.id.a7);
        b8 = (Button) findViewById(R.id.a8);
        b9 = (Button) findViewById(R.id.a9);
        bAC = (Button) findViewById(R.id.aAC);
        bc = (Button) findViewById(R.id.ac);
        bdot = (Button) findViewById(R.id.adot);
        bd = (Button) findViewById(R.id.ad);
        bm = (Button) findViewById(R.id.am);
        bs = (Button) findViewById(R.id.as);
        ba = (Button) findViewById(R.id.aa);
        bp = (Button) findViewById(R.id.ap);
        bup= (TextView) findViewById(R.id.up);
        be = (Button) findViewById(R.id.ae);


        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=txv.getText().toString();
                if(num.length()>0)
                num=num.substring(0,num.length()-1);
                txv.setText(num);


            }
        });
        bAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txv.setText("0");
                num2="0";
                op='+';
                bup.setText("0");
                num="";


            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=txv.getText().toString();
                txv.setText("0");
                num2=calu(num2,op,num);
                op='/';
                bup.setText(num2+"/");
                num="";
                txv.setText("0");


            }
        });
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=txv.getText().toString();
                txv.setText("0");
                num2=calu(num2,op,num);
                op='+';
                bup.setText(num2);
                num="";
                num2="0";
                txv.setText("0");


            }
        });
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=txv.getText().toString();
                txv.setText("0");
                num2=calu(num2,op,num);
                op='+';
                bup.setText(num2+"+");
                num="";
                txv.setText("0");


            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=txv.getText().toString();
                txv.setText("0");
                num2=calu(num2,op,num);
                op='*';
                bup.setText(num2+"*");
                num="";
                txv.setText("0");


            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=txv.getText().toString();
                txv.setText("0");
                num2=calu(num2,op,num);
                op='-';
                bup.setText(num2+"-");
                num="";
                txv.setText("0");


            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=txv.getText().toString();
                txv.setText("0");
                num2=calu(num2,op,num);
                op='%';
                bup.setText(num2+"%");
                num="";
                txv.setText("0");


            }
        });


        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=txv.getText().toString();

                txv.setText(num+".");


            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=txv.getText().toString();

                txv.setText(num+"0");


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=txv.getText().toString();

                txv.setText(num+"2");


            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=txv.getText().toString();

                txv.setText(num+"3");


            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=txv.getText().toString();

                txv.setText(num+"4");


            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=txv.getText().toString();

                txv.setText(num+"5");


            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=txv.getText().toString();

                txv.setText(num+"6");


            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=txv.getText().toString();

                txv.setText(num+"7");


            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=txv.getText().toString();

                txv.setText(num+"8");


            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=txv.getText().toString();

                txv.setText(num+"9");


            }
        });


    }
    String calu(String num,char op,String num2)
    {
        double x=0;
      switch(op)
        {
            case '+':x=Double.parseDouble(num)+Double.parseDouble(num2);
                break;
            case '-':x=Double.parseDouble(num)-Double.parseDouble(num2);
                break;
            case '*':x=Double.parseDouble(num)*Double.parseDouble(num2);
                break;
            case '/':x=Double.parseDouble(num)/Double.parseDouble(num2);
                break;
            case '%':x=Double.parseDouble(num)%Double.parseDouble(num2);
                break;
            
                
        }
        return Double.toString(x);
    }
}
