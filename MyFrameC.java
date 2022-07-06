import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrameC  extends JFrame {
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;
    MyFrameC() throws InterruptedException {   this.setTitle("CLOCK_E");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(350,220);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        timeFormat=new SimpleDateFormat("hh:mm:ss a");
        dayFormat=new SimpleDateFormat("E");
        dateFormat=new SimpleDateFormat("MMM dd ,yyyy");
        timeLabel=new JLabel();
        dayLabel=new JLabel();
        dateLabel=new JLabel();
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
        timeLabel.setForeground(Color.green);
        timeLabel.setBackground(new Color(0x123456));
        timeLabel.setOpaque(true);
        //---------------------------------
        dayLabel.setFont(new Font("Ink Free",Font.PLAIN,35));
        dayLabel.setForeground(Color.red);
        dayLabel.setBackground(Color.BLACK);
        dayLabel.setOpaque(true);
        //-----------------------------------
        dateLabel.setFont(new Font("Ink free",Font.BOLD,30));
        dateLabel.setForeground(new Color(0x6671));
        //dateLabel.setBackground(Color.BLACK);
        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.add(new JLabel("                                                                                  > dhiraj alate :)"));
        this.getContentPane().setBackground(Color.BLACK);
        this.setVisible(true);
        //this.pack();
        setTime();
    }
    public void setTime() throws InterruptedException {
        while(true)
        {time=timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day=dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText("                  "+day+"                  ");

            date=dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText("               "+date+"                   ");

            Thread.sleep(1000);
        }
    }
}