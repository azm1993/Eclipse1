import java.awt.*;       // Using AWT's containers and components
import java.awt.event.*; // Using AWT's event classes and listener interfaces
 
// A GUI program inherits the top-level Container java.awt.Frame
   public class AWTAccumulator extends Frame implements ActionListener {
   private Label lblInput;     // Declare input Label
   private Label lblInput2;
   private Label lblOutput;// Declare output Label
   private Label lblOutput2;
   private TextField tfInput;  // Declare input TextField
   private TextField tfInput2;
   private TextField tfOutput; // Declare output display TextField
   private int sum = 0;        // The accumulated sum, init to 0
 
   // Constructor to setup the UI components and event handlers
   public AWTAccumulator() {
      setLayout(new FlowLayout()); // "super" Frame sets to FlowLayout
      lblInput = new Label("Entre la Estatura"); // Construct component Label
      add(lblInput);  // "super" Frame adds the Label
      tfInput = new TextField(10);  // Construct component TextField
      lblInput2 = new Label("Entre el Nombre ");
      tfInput2 = new TextField(10);  // Construct component TextField
      add(tfInput);   // "super" Frame adds the TextField
      
      tfInput.addActionListener(this);
         // tfInput is a source that fires ActionEvent when entered.
         // The source add "this" instance as a ActionEvent listener, which provides
         //  an ActionEvent handler called actionPerformed().
         // Hitting enter on tfInput invokes actionPerformed().
 
      lblOutput = new Label("private Label lblInput2;");  // Construct component Label
      add(lblOutput);  // "super" Frame adds Label
 
      tfOutput = new TextField(10); // Construct component TextField
      tfOutput.setEditable(false);  // read-only
      add(tfOutput);   // "super" Frame adds TextField
 
      setTitle("AWT Accumulator"); // "super" Frame sets title
      setSize(350, 120);    // "super" Frame sets initial size
      setVisible(true);     // "super" Frame shows
   }
 
   // The entry main() method
   public static void main(String[] args) {
      // Invoke the constructor by allocating an anonymous instance
      new AWTAccumulator();
   }
 
   // ActionEvent handler - Called back when enter key was hit on TextField.
   @Override
   public void actionPerformed(ActionEvent evt) {
      int numberIn = Integer.parseInt(tfInput.getText());
               // Get the String entered, convert to int
      sum += numberIn;      // Accumulate numbers entered into sum
      tfInput.setText("");  // Clear input TextField
      tfOutput.setText("" + sum); // Display sum on the output TextField, convert int to String
   }
}

