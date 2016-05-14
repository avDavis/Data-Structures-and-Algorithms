/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.LinkedList;
/**
 * Class OracleAPI uses Oracle API to implement basic linked list functions
 * The list is sorted alphanumerically
 * @author Angelica Davis
 */
public class OracleAPI {
    LinkedList<String> list;
    
    /*
     * Constructor for class OracleAPI 
     * initializes the linked list to the specified list
     */
    public OracleAPI(LinkedList<String> list_in){
        list = list_in;
    }
    
    /*
     * Default Constructor for class OracleAPI
     */
    public OracleAPI(){
        list = new LinkedList<String>();
    }
    
    /*
     * Adds a String s to the list, including duplicates
     */
    public void addString(String s){
        // handle case when list is empty
        if(list.isEmpty() || list == null){
            list.add(s);
        }// handle case when s precedes any string in the list
        else if(list.getFirst().compareTo(s) >= 0){
            list.offerFirst(s);
        }// handle case when s is last in a list (i.e. does not precede any string)
        else if(list.getLast().compareTo(s) <= 0){
            list.offerLast(s);
        }
        // handle the normal case (insert s somewhere in the middle of the list)
        else{
            for(int i = 1; i < list.size(); i++){
                // s precedes the current string
                if(list.get(i).compareTo(s) >= 0){
                    list.add(i, s);
                    break;
                }
            }
        }
    }
    
    /*
     * Adds a String s to the list, not including duplicates
     */
    public void addUniqueString(String s){
        // handle case when list is empty
        if(list.isEmpty()){
            list.add(s);
        }// handle case when s precedes any string in the list
        else if(list.getFirst().compareTo(s) > 0){
            list.offerFirst(s);
        }// handle case when s is last in a list (i.e. does not precede any string)
        else if(list.getLast().compareTo(s) < 0){
            list.offerLast(s);
        }
        // handle the normal case (insert s somewhere in the middle of the list)
        else{
            for(int i = 1; i < list.size(); i++){
                // s precedes the current string
                if(list.get(i).compareTo(s) > 0){
                    list.add(i, s);
                    break;
                }
                if(list.get(i).compareTo(s) == 0){
                    break;
                }
            }
        }
    }
    
    public void removeString(String s){
        list.remove(s);
    }
    
    /*
     * Returns the index of the specified string
     * returns -1 if the string is not in the list
     */
    public int findString(String s){
        int index = -1;
        if(list.contains(s)){
            index = list.indexOf(s);
        }
        return index;
    }
    
    /*
     * Returns the string at the specified index
     */
    public String getString(int i){
        return list.get(i);
    }
    
    /*
     * Removes duplicate strings in the list
     */
    public void removeDuplicates(){
        for (int i = 0; i < list.size() -1; i++){
            while (i < list.size() - 1 && list.get(i).equals(list.get(i + 1))){
                list.remove(i+1);
            }
        }
    }
    
    public void printList(){
        for(int i = 0; i < list.size(); i++){
            System.out.format("%s\n", list.get(i));
        }
        System.out.println();
    }
}
