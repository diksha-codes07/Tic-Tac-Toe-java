import java.awt.*;
import java.awt.event.*;

//MAIN WINDOW 

class fix extends Frame implements ActionListener
{  
 Button b1,b2,b3;
 Label l1,l2,l3; 
 fix()
 { 
  Color bg = new Color(236,240,241);      // Light background
  Color dark = new Color(44,62,80);       // Dark blue
  Color blue = new Color(52,152,219);     // Blue
  Color green = new Color(39,174,96);     // Green
  Color red = new Color(231,76,60);       // Red
  Color white = Color.WHITE;
  setBackground(bg);
  l1=new Label("LET'S PLAY");
  l1.setFont(new Font("Segoe UI",Font.BOLD,48));
  l1.setBounds(290,170,500,70);
  l1.setForeground(dark);
  add(l1);
  l2=new Label("TIC-TAC-TOE");
  l2.setBounds(330,255,350,40);
  l2.setFont(new Font("Segoe UI",Font.BOLD,52));
  l2.setForeground(dark);
  add(l2);
  b1=new Button("EXIT");
  b1.setBounds(150,400,170,80);
  b1.setBackground(dark);
  b1.setForeground(white);
  add(b1);
  b2=new Button("START");
  b2.setBounds(375,400,170,80);
  b2.setBackground(dark);
  b2.setForeground(white);
  add(b2);
  b3=new Button("HELP");
  b3.setBounds(600,400,170,80);
  b3.setBackground(dark);
  b3.setForeground(white);
  add(b3);
  l3=new Label("");
  l3.setBounds(340,650,300,30);
  l3.setFont(new Font("Segoe UI",Font.ITALIC,16));
  l3.setForeground(dark);
  add(l3);
          b1.addActionListener(this);
          b2.addActionListener(this);
          b3.addActionListener(this);

  setLayout(null);
  setSize(1000,1000);
  setVisible(true);
  setTitle("Tic-Tac-Toe");
  
 }

  public void actionPerformed(ActionEvent ae)
          {
                if(ae.getSource()==b1)
                   {
                     System.exit(0);
                    }
                if(ae.getSource()==b2)
                  {
                        new win2();
                       }
                
                if (ae.getSource()==b3)
                   {
                   new HelpWin();
                   }
                   
         }

}

//HELP WINDOW FOR HELP BUTTON

class HelpWin extends Frame implements ActionListener
{
    TextArea helpText;
    Button b1;
    HelpWin()
    {   
        Color bg = new Color(236,240,241);      // Light background
        Color dark = new Color(44,62,80);       // Dark blue
        Color blue = new Color(52,152,219);     // Blue
        Color green = new Color(39,174,96);     // Green
        Color red = new Color(231,76,60);       // Red
        Color white = Color.WHITE;
        setBackground(bg);
        setTitle("How To Play - Tic Tac Toe");
        setSize(700, 550);
        setBackground(new Color(236,240,241));
        helpText = new TextArea();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((d.width-700)/2,(d.height-550)/2);
        setLayout(new BorderLayout());
        add(helpText, BorderLayout.CENTER);
        helpText.setText(
                " TIC-TAC-TOE HELP\n\n" +

                " ══════════════════════════════════════\n" +
                " OBJECTIVE\n" +
                " ══════════════════════════════════════\n" +
                " Place three identical symbols in a row.\n" +
                " You can win horizontally, vertically,\n" +
                " or diagonally.\n\n" +

                " ══════════════════════════════════════\n" +
                " To Play the Game\n" +
                " ══════════════════════════════════════\n" +
                " 1. Enter Player X name.\n" +
                " 2. Enter Player O name.\n" +
                " 3. Click START.\n\n" +

                " Player X always gets the first turn.\n" +
                " Player O plays second.\n" +
                " Players take turns until someone wins\n" +
                " or the board is full.\n\n" +
   
                " ══════════════════════════════════════\n" +
                " WINNING CONDITIONS\n" +
                " ══════════════════════════════════════\n" +

                " Horizontal Win:\n" +
                " ❌ ❌ ❌\n\n" +

                " Vertical Win:\n" +
                " ❌\n" +
                " ❌\n" +
                " ❌\n\n" +

                " Diagonal Win:\n" +
                " ❌\n" +
                "   ❌\n" +
                "     ❌\n\n" +

                " ══════════════════════════════════════\n" +
                " DRAW GAME\n" +
                " ══════════════════════════════════════\n" +
                " If all 9 cells are filled and\n" +
                " nobody wins, the game ends in a draw.\n\n" +

                " ══════════════════════════════════════\n" +
                " SCOREBOARD\n" +
                " ══════════════════════════════════════\n" +
                " Player X Wins\n" +
                " Player O\n" +
                " Draw Count\n\n" +

                " ══════════════════════════════════════\n" +
                " BUTTONS\n" +
                " ══════════════════════════════════════\n" +
                " NEW GAME → Start a new round.\n" +
                " BACK → Return to previous screen.\n" +
                " EXIT → Close the game.\n\n" +

                " ══════════════════════════════════════\n" +
                " AFTER MATCH ENDS\n" +
                " ══════════════════════════════════════\n" +
                " Continue → Play another round.\n" +
                " End Game → Exit the game.\n\n" +

                " ══════════════════════════════════════\n" +
                " TIPS\n" +
                " ══════════════════════════════════════\n" +
                " • Try taking the center box first.\n" +
                " • Block your opponent's winning move.\n" +
                " • Watch the diagonals carefully.\n" +
                " • Plan your next move ahead.\n"
        );

        helpText.setEditable(false);
        helpText.setFont(new Font("Segoe UI",Font.PLAIN,16));
        b1=new Button("CLOSE");
        b1.setBackground(dark);
        b1.setForeground(white);
        add(b1,BorderLayout.SOUTH);
        b1.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
             {
                if(ae.getSource()==b1)
                 {
                  dispose();
                  }
             }
}

//TO ENTER PLAYER NAMES

class win2 extends Frame implements ActionListener {
    Label l1, l2;
    TextField t1,t2;
    Button b1,b2;

    win2()
 {
        Color bg = new Color(236,240,241);      // Light background
        Color dark = new Color(44,62,80);       // Dark blue
        Color blue = new Color(52,152,219);     // Blue
        Color green = new Color(39,174,96);     // Green
        Color red = new Color(231,76,60);       // Red
        Color white = Color.WHITE;
        setBackground(bg);
        setSize(1000,1000);
        setLayout(null);

        l1 = new Label("PLAYER X");
        l1.setBounds(200,200,200,40); add(l1);
        l1.setForeground(dark);
        l2 = new Label("PLAYER O");
        l2.setBounds(200,270,200,40); add(l2);
        l2.setForeground(dark);
        t1= new TextField();
        t1.setBounds(400,200,200,50); add(t1);

        t2= new TextField();
        t2.setBounds(400,270,200,50); add(t2);

        b1=new Button("START");
        b1.setBounds(230, 370, 180, 45); add(b1);
  b1.setBackground(dark);
  b1.setForeground(white);
        b2=new Button("CLOSE");
        b2.setBounds(450,370,180,45); add(b2);
  b2.setBackground(dark);
  b2.setForeground(white);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setTitle("Enter Player Names");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
     {
        if(ae.getSource()==b1)
          {
            String pX = t1.getText();
            String pO = t2.getText();
            dispose();
            new win3(pX, pO); // pass names to Window4
        }
        if(ae.getSource()==b2)
        {
            dispose();
        }
    }
}


//GAME WINDOW

class win3 extends Frame implements ActionListener {
    Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    boolean isXTurn = true;
    int scoreX=0, scoreO=0, drawCount=0;
    String playerXName, playerOName;

    win3(String pX, String pO)
 {
        Color bg = new Color(236,240,241);      // Light background
        Color dark = new Color(44,62,80);       // Dark blue
        Color blue = new Color(52,152,219);     // Blue
        Color green = new Color(39,174,96);     // Green
        Color red = new Color(231,76,60);       // Red
        Color white = Color.WHITE;
        setBackground(bg);
        this.playerXName = pX;
        this.playerOName = pO;

        l1=new Label("PLAYER X: " + playerXName);
        l1.setBounds(50,50,200,40); add(l1);
l1.setForeground(dark);
        l2=new Label("PLAYER O: " + playerOName);
        l2.setBounds(50,100,200,40); add(l2);
l2.setForeground(dark);
        l3=new Label("DRAW: ");
        l3.setBounds(50,150,100,40); add(l3);
l3.setForeground(dark);
        l4=new Label("0");
        l4.setBounds(270,50,100,40); add(l4);
l4.setForeground(dark);
        l5=new Label("0");
        l5.setBounds(270,100,100,40); add(l5);
l5.setForeground(dark);
        l6=new Label("0");
        l6.setBounds(270,150,100,40); add(l6);
l6.setForeground(dark); 
        l9=new Label("STATUS:");
        l9.setBounds(50,200,100,40); add(l9);
l9.setForeground(dark);
        l10=new Label("Player X Turn");
        l10.setBounds(170,200,200,40); add(l10);
  l10.setForeground(dark); 
   b1=new Button();
   b1.setBounds(500,50,120,120);
b1.setBackground(dark);
  b1.setForeground(white);
   add(b1);
   b2=new Button();
   b2.setBounds(620,50,120,120);
b2.setBackground(dark);
  b2.setForeground(white);
   add(b2);
   b3=new Button();
   b3.setBounds(740,50,120,120);
b3.setBackground(dark);
  b3.setForeground(white);
   add(b3);
   b4=new Button();
   b4.setBounds(500,170,120,120);
b4.setBackground(dark);
  b4.setForeground(white);
   add(b4);
   b5=new Button();
   b5.setBounds(620,170,120,120);
b5.setBackground(dark);
  b5.setForeground(white);
   add(b5);
   b6=new Button();
   b6.setBounds(740,170,120,120);
b6.setBackground(dark);
  b6.setForeground(white);
   add(b6);
   b7=new Button();
   b7.setBounds(500,290,120,120);
b7.setBackground(dark);
  b7.setForeground(white);
   add(b7);
   b8=new Button();
   b8.setBounds(620,290,120,120);
b8.setBackground(dark);
  b8.setForeground(white);
   add(b8);
   b9=new Button();
   b9.setBounds(740,290,120,120);
b9.setBackground(dark);
  b9.setForeground(white);
   add(b9);
   b10=new Button("BACK");
   b10.setBounds(200,470,100,80);
b10.setBackground(dark);
  b10.setForeground(white);
   add(b10);
   b11=new Button("NEW GAME");
   b11.setBounds(370,470,100,80);
b11.setBackground(dark);
  b11.setForeground(white);
   add(b11);
   b12=new Button("EXIT");
   b12.setBounds(540,470,100,80);
b12.setBackground(dark);
  b12.setForeground(white);
   add(b12);


          b1.addActionListener(this);
          b2.addActionListener(this);
          b3.addActionListener(this);
          b4.addActionListener(this);
          b5.addActionListener(this);
          b6.addActionListener(this);
          b7.addActionListener(this);
          b8.addActionListener(this);
          b9.addActionListener(this);
          b10.addActionListener(this);
          b11.addActionListener(this);
          b12.addActionListener(this);

   setTitle("Game Board");
   setSize(1000,750);
   setLayout(null);
   setVisible(true);
  }

public void actionPerformed(ActionEvent ae)
             {
 
        Button clicked = (Button)ae.getSource();

        if(clicked == b12) 
       {
            dispose();
            new fix(); // back to Main Window
        }
        else if(clicked == b10)
        {
            dispose();
            new win2(); // back to Enter Name Window
        }
        else if(clicked == b11)
         {
            resetGame();
          }
       
        else 
          {
            if(isXTurn)
           {
                clicked.setLabel("X");
                l10.setText("Player O Turn");
            }
           else 
            {
                clicked.setLabel("O");
                l10.setText("Player X Turn");
            }
            clicked.setEnabled(false);
            isXTurn = !isXTurn;
            checkWinner();
        }
    }
        
 void resetGame()
       {
        Button[] buttons = {b1,b2,b3,b4,b5,b6,b7,b8,b9};
        for(Button b : buttons)
        {
            b.setLabel("");
            b.setEnabled(true);
            b.setBackground(new Color(44,62,80));
            b.setForeground(Color.WHITE);
            b.setBounds(b.getX(), b.getY(), 120, 120);
        }
        isXTurn = true;
        l10.setText("Player X Turn");
    }


    void checkWinner(){
        String[][] grid = {
            {b1.getLabel(), b2.getLabel(), b3.getLabel()},
            {b4.getLabel(), b5.getLabel(), b6.getLabel()},
            {b7.getLabel(), b8.getLabel(), b9.getLabel()}
        };

        Button[][] btns = {
            {b1,b2,b3},
            {b4,b5,b6},
            {b7,b8,b9}
        };

        for(int i=0;i<3;i++){
            if(!grid[i][0].equals("") && grid[i][0].equals(grid[i][1]) && grid[i][1].equals(grid[i][2])){
                highlightWinner(btns[i][0], btns[i][1], btns[i][2], grid[i][0]);
                return;
            }
            if(!grid[0][i].equals("") && grid[0][i].equals(grid[1][i]) && grid[1][i].equals(grid[2][i])){
                highlightWinner(btns[0][i], btns[1][i], btns[2][i], grid[0][i]);
                return;
            }
        }

        if(!grid[0][0].equals("") && grid[0][0].equals(grid[1][1]) && grid[1][1].equals(grid[2][2])){
            highlightWinner(btns[0][0], btns[1][1], btns[2][2], grid[0][0]);
            return;
        }
        if(!grid[0][2].equals("") && grid[0][2].equals(grid[1][1]) && grid[1][1].equals(grid[2][0])){
            highlightWinner(btns[0][2], btns[1][1], btns[2][0], grid[0][2]);
            return;
        }

        boolean full = true;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(grid[i][j].equals("")) full=false;
            }
        }
        if(full){
            l10.setText("Game Draw!");
            drawCount++;
            l6.setText(String.valueOf(drawCount));
        }
    }

    void highlightWinner(Button b1, Button b2, Button b3, String player){
        l10.setText("Player " + player + " Wins!");
        Button[] buttons = {this.b1,this.b2,this.b3,this.b4,this.b5,this.b6,this.b7,this.b8,this.b9};
        for(Button b : buttons) b.setEnabled(false); // stop game

        // Highlight winning buttons
        Button[] winners = {b1,b2,b3};
        for(Button b : winners){
            b.setBackground(Color.blue); // change color
            b.setBounds(b.getX(), b.getY(), 110, 110); // make bigger
         }
       if(player.equals("X")) {
            scoreX++;
            l4.setText("" + scoreX); // update Player X score
        } else {
            scoreO++;
            l5.setText("" + scoreO); // update Player O score
        }
 }
}

//MAIN CLASS
class chk_fix
{
 public static void main(String args[])
 {
  fix w=new fix();
 } 
}




