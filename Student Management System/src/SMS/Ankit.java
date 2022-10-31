  //This 
package SMS;

// This project is developed by Ankit Gangwar for TailorSoft.
import java.awt.EventQueue;

  import javax.swing.JLabel;
  import javax.swing.JOptionPane;
  import javax.swing.JPanel;
  import javax.swing.JTable;
  import javax.swing.table.DefaultTableModel;


  public class Ankit {

      private JFrame frame;
      private JTextField textField;
      private JTextField textField_1;
      private JTextField textField_2;
      private JTextField textField_3;
      private JTable table;
      private JScrollPane scrollPane;
      private JButton btnAdd;
      private JButton btnDelete;
      private JButton btnUpdate;
      private JButton btnClear;
      DefaultTableModel model;

      public static void main(String[] args) {
          // TODO Auto-generated method stub
          EventQueue.invokeLater(new Runnable()){
              public void run() {
                  try {
                      StudentMS window = new StudentMS();
                      window.frame.setVisible(true);
                  }catch (Exception e) {
                      e.printStackTrace();
                  }
              }
          });

		public table_demo() {
              initialize();
          }

          private void initialize() {
              frame = new JFrame();
              frame.setBounds(100, 100, 538, 437);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.getContentPane().setLayout(null);

              JPanel panel = new JPanel();
              panel.setBackgroundd(new Color(176, 196, 222));
              panel.setBounds(0, 0, 531, 410);
              frame.getContentPane().add(panel);
              panel.setLayout(null);

              JLabel lblName = new JLable("ID :");
              lblName.setBounds(21, 83, 46, 14);;
              panel.add(lblName);

              JLabel lblName_1 = new JLable("Name :");
              lblName_1.setBounds(21, 105, 46, 14);;
              panel.add(lblName_1);

              JLabel lblContact = new JLable("Contact :");
              lblContact.setBounds(21, 127, 46, 14);;
              panel.add(lblContact);

              JLabel lblCourse = new JLable("Course :");
              lblCourse.setBounds(21, 148, 46, 14);;
              panel.add(lblCourse);

              textField = new JtextField();
              textField.setBounds(67, 81, 132, 17);
              textField.setColumns(10);
              panel.add(textField);

              textField_2 = new JtextField();
              textField_2.setBounds(66, 125, 134, 18);
              textField.setColumns(10);
              panel.add(textField_2);

              textField = new JtextField();
              textField.setBounds(67, 145, 132, 17);
              textField_3.setColumns(10);
              panel.add(textField_3);

              scrollPane = new JScrollPane();
              scrollPane.setBounds(224, 48, 297, 339);
              panel.add(scrollPane);

              table = new JTable();
              table.addMouseListener(new MouseAdapter() {
                  public void mouseClicked(MouseEvent arg0) {
                      int i = table.getSelectedRow();
                      id.setText(model.getValueAt(i, 0).toString());
                      name.setText(model.getValueAt(i, 1).toString());
                      cont.setText(model.getValueAt(i, 2).toString());
                      course.setText(model.getValueAt(i, 3).toString());
                  }
              });
              table.setBackground(new Color(170, 195, 220));
              model = new DefaultTableModel();
              Object[] column = {"ID", "Name", "Contact", "Course"};
              Object[] row = new Object[0];
              model.setColumnIdentifiers(column);
              table.setModel(model);
              scrollPane.setViewportView(table);

              btnAdd = new JButton("Add");
              btnAdd.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent arg0) {
                      if(id.getText().equals("") || name.getText().equals("") || course.getText().equals("") || cont.getText().equals(""))
                      {
                          JOptionPane.showMessageDialog(null, "Please Fill Complete Data");
                      }
                      else
                      {
                          row[0]=id.getText();
                          row[1]=name.getText();
                          row[2]=cont.getText();
                          row[3]=course.getText();
                          model.addRow(row);

                          id.setText("");
                          name.setText("");
                          contact.setText("");
                          course.setText("");
                          JOptionPane.showMessageDialog(null, "Saved Successfully");
                      }
                  }
              });
              btnAdd.setBounds(10, 210, 92, 24);
              panel.add(btnAdd);

              btnDelete = new JButton("Delete");
              btnDelete.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent arg0) {
                      int i = table.getSelectRow();
                      if(i>=0) {

                          model.removeRow(i);
                          JOptionPane.showMessageDialog(null, "Deleted Successfully");
                      }
                      else
                      {
                          JOptionPane.showMessageDialog(null, "Please Select a Row");
                      }

                  }
              });

              btnDelete.setBounds(10, 325, 93, 23);
              panel.add(btnDelete);

              btnUpdate = new JButton("Update");
              btnUpdate.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent arg0) {

                      int i = table.getSelectRow();
                      if(i>=0) {

                          model.setValueAt(id.getText(), i, 0);
                          model.setValueAt(name.getText(), i, 1);
                          model.setValueAt(cont.getText(), i, 2);
                          model.setValueAt(course.getText(), i, 3);
                          JOptionPane.
                                  showMessageDialog(null, "Updated Successfully");
                      }
                      else
                      {
                          JOptionPane.showMessageDialog(null, "Please Select a Row");
                      }
                  }
              });
              btnUpdate.setBounds(133, 280, 101, 23);
              panel.add(btnUpdate);

              btnClear = new JButton("Clear");
              btnClear.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent arg0) {
                      id.setText("");
                      name.setText("");
                      cont.setText("");
                      course.setText("");
                  }
              });

              btnClear.setBounds(133, 324, 101, 23);
              panel.add(btnClear);

          }


      }
  }