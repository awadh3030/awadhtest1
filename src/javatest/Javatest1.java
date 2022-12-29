package javatest;
import java.io.BufferedWriter;
import java.io.File; 
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;




public class Javatest1 {

	public static void main(String[] args) {
		
	/*	Scanner sca = new Scanner(System.in);

		
		ArrayList<Department> DD = new ArrayList<Department>();
		 Stack<String> stack = new Stack<String>();
		 
		 boolean condition01 = true;

			while (condition01) {
				Department departmentObject0 = new Department();
		
		
		System.out.println("Enter the Departmen Name ");
		String departmentName = sca.next();
		departmentObject0.setDepartName(departmentName);
		
		stack.push(departmentName);
		
		System.out.println("Enter the Departmen Number ");
		int departmentnumber = sca.nextInt();
		departmentObject0.setDepartId(departmentnumber);
		
		String department = Integer.toString(departmentnumber);
		stack.push(department);
		
		DD.add(departmentObject0);
		condition01 = false;
			}*/
		
			
		/*try {  
		      BufferedWriter writer = new BufferedWriter(new FileWriter("filename.pdf"));  
		      writer.write(" This my my text file ");
		      for (String list : stack)
		      {
			      writer.write("\n"+list);

		      }
		      writer.close();
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();  
		
			}*/
			try
			{
			String[] Names = new String[100];
			Names[0] = "0";
			Names[1] = "1";
			Names[2] = "2";
			Names[3] = "3";
			Names[4] = "4";
			Names[5] = "5";
			Names[6] = "6";
			Names[7] = "7";
			Names[8] = "8";
			Names[9] = "9";
			Names[10] = "10";
			Names[11] = "11";
			Names[12] = "12";
			Names[13] = "13";
			Names[14] = "14";
			Names[15] = "15";
			Names[16] = "16";
			Names[17] = "17";
			Names[18] = "18";
			Names[19] = "19";
			Names[20] = " 20";
			Names[21] = " 21";
			Names[22] = " 22";
			Names[23] = " 23";
			Names[24] = " 24";
			Names[25] = " 25";
			Names[26] = " 26";
			Names[27] = "27";
			Names[28] = "28";
			Names[29] = "29";
			Names[30] = "30";
			Names[31] = "31";
			Names[32] = "32";
			Names[33] = "33";
			Names[34] = "34";
			Names[35] = "35";
			Names[36] = "36";
			Names[37] = "37";
			Names[38] = "38";
			Names[39] = "39";
			Names[40] = "40";
			Names[41] = "41";
			Names[42] = "42";
			Names[43] = "43";
			Names[44] = "44";
			Names[45] = "45";
			Names[46] = "46";
			Names[47] = "47";
			Names[48] = "48";
			Names[49] = "49";
			Names[50] = "50";
			Names[51] = "51";
			Names[52] = "52";
			Names[53] = "53";
			Names[54] = "54";
			Names[55] = "55";
			Names[56] = "56";
			Names[57] = "57";
			Names[58] = "58";
			Names[59] = "59";
			Names[60] = "60";
			Names[61] = "61";
			Names[62] = "62";
			Names[63] = "63";
			Names[64] = "64";
			Names[65] = "65";
			Names[66] = "66";
			Names[67] = "67";
			Names[68] = "68";
			Names[69] = "69";
			Names[70] = "70";
			Names[71] = "71";
			Names[72] = "72";
			Names[73] = "73";
			Names[74] = "74";
			Names[75] = "75";
			Names[76] = "76";
			Names[77] = "77";
			Names[78] = "78";
			Names[79] = "79";
			Names[80] = "80";
			Names[81] = "81";
			Names[82] = "82";
			Names[83] = "83";
			Names[84] = "84";
			Names[85] = "85";
			Names[86] = "86";
			Names[87] = "87";
			Names[88] = "88";
			Names[89] = "89";
			Names[90] = "90";
			Names[91] = "91";
			Names[92] = "92";
			Names[93] = "93";
			Names[94] = "94";
			Names[95] = "95";
			Names[96] = "96";
			Names[97] = "97";
			Names[98] = "98";
			Names[99] = "99";
			
			
			for(int j = 0; j<Names.length; j++)
			{
				BufferedWriter writer = new BufferedWriter(new FileWriter(Names[j]+".pdf"));
				
				System.out.println(writer);
				File myObj = new File(Names[j]+".pdf");
			    if (myObj.exists()) {
			      System.out.println("File name: " + myObj.getName()); 
			      System.out.println("Absolute path: " + myObj.getAbsolutePath()); 
			      System.out.println("Writeable: " + myObj.canWrite()); 
			      System.out.println("Readable: " + myObj.canRead()); 
			      System.out.println("File size in bytes: " + myObj.length());
			    } else {
			      System.out.println("The file does not exist.");
			    }
				
			}
			}
			catch(Exception e)
			{
			e.printStackTrace();
		
	}
			
			
			

}
}
