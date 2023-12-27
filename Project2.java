import java.awt.Container;
import java.awt.TextArea;
import javax.swing.*;
import java.util.*;

public class Project2{
    public static void main(String[] args){
        TextFileInput in = new TextFileInput("test.txt"); //prepares to input text file
        Date212GUI date212GUI = new Date212GUI(); //creates GUI where valid dates will be appended
        Container myContentPane = date212GUI.getContentPane(); //creates content pane for said GUI

        TextArea UnsortedDates = new TextArea();
        TextArea SortedDates = new TextArea(); //establishes TextAreas for unsorted and sorted dates

        myContentPane.add(UnsortedDates);
        myContentPane.add(SortedDates); //appends unsorted and sorted TextAreas to the content

        UnsortedDate212List unsortedList = new UnsortedDate212List();
        SortedDate212List sortedList = new SortedDate212List(); //establishes unsorted and sorted lists

        String line = in.readLine(); //reads in first line of the text file

        while (line != null){	
            StringTokenizer myTokens = new StringTokenizer(line,",");			
            while (myTokens.hasMoreTokens()){
                Date212 temp = new Date212(myTokens.nextToken());
                if (temp.isValid()){
                    unsortedList.add(temp);
                    sortedList.add(temp);
                }else System.out.println("Invalid date: " + temp.toRaw());
            } //ensures that each token (date) is read if they're separated by commas
            line = in.readLine(); //moves to next line
        } //reads in text file lines until there are no more lines to be read

        in.close(); //closes file so my RAM doesn't grenade

        Date212Node unsortedTemp = unsortedList.getFirst();
        Date212Node sortedTemp = sortedList.getFirst(); //grabs first nodes of unsortedList and sortedList

        while (unsortedTemp != null && sortedTemp != null){
            UnsortedDates.append((unsortedTemp.data).toString() + "\n");
            SortedDates.append((sortedTemp.data).toString() + "\n");
            unsortedTemp = unsortedTemp.next;
            sortedTemp = sortedTemp.next;
        } //iterates through both lists and appends their contents to the respective GUIs
    } //main method
} //class Project2