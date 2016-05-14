/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Angelica Davis
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OracleAPI test = new OracleAPI();
        // Testing alphanumeric ordering
        // test cases: adding generic strings, an empty string, duplicate strings
        test.addString("string");
        test.addString("test");
        test.addString("");
        test.addString("abc");
        test.addString("string");
        test.addString("cat");
        test.addString("xyz");
        test.printList();
        
        // Testing string removal
        test.removeString("");
        test.printList(); 
        
        test.addString("string");
        test.addString("abc");
        test.addString("xyz");
        test.printList();
        test.removeDuplicates();
        test.printList();
       
        test.addUniqueString("string");
        test.addUniqueString("test");
        test.printList();
    }
}
