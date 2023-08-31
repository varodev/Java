package poo;
import java.util.*;
public class poo4 {
	int vector[]=new int[10];
	Random rnd = new Random();


public void rellenar() {
	System.out.println("Se rellena el vector.... ");
	for (int i=0; i<vector.length;i++) {
		vector[i]=rnd.nextInt(8)+1;
	}
}
public void visualizar() {
	System.out.println("Se visualiza de izquierda a derecha");
	for (int i=0; i<vector.length;i++) {
		System.out.print(vector[i] + " ");
	}
}
public void reverse() {
	System.out.println("\nSe visualiza de derecha a izquierda");
	for (int i=0; i<vector.length;i++) {
		System.out.print(vector[vector.length-1-i]+ " ");
	}
}
}