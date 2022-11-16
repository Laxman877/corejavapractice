package com.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Serialization01 {
	private static Object object1;
	private static Employee oin;

	public static void main(String[] args) {
//		try {
//			OutputStream fout=new FileOutputStream("ser.txt");
//			ObjectOutput oout=new ObjectOutputStream(fout);
//			System.out.println("Serialization process has started, serializing employee objects...");
//			oout.writeObject(object1);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			InputStream fin=new FileInputStream("ser.txt");
			ObjectInput oout=new ObjectInputStream(fin);
			System.out.println("Deserialization process has started, displaying employee object...");
			Employee emp;
			emp=(Employee)oin.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
