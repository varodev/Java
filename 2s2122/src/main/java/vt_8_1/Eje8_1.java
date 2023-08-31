/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vt_8_1;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class Eje8_1 extends javax.swing.JFrame implements ActionListener{

    private JMenuBar mb;
    private JMenu archivo, edicion, formato, ayuda,apariencia,color;
    private JMenuItem abrir,salir,cortar,copiar,pegar,seleccionarTodo,contarPalabras,negro,blanco,rojo;
    private JTextArea blocNotas;
    private JLabel lblPalabras,lblCaracteres;
    
    public Eje8_1() throws HeadlessException{
        inicio();
    }

    private void inicio() {
        mb=new JMenuBar();
        archivo=new JMenu("Archivo");
        edicion=new JMenu("Edicion");
        formato=new JMenu("Formato");
        ayuda=new JMenu("Ayuda");
        apariencia=new JMenu("Apariencia");
        color=new JMenu("Color");
        
        abrir=new JMenuItem("Abrir");
        salir=new JMenuItem("Salir");
        cortar=new JMenuItem("Cortat");
        copiar=new JMenuItem("Copiar");
        pegar=new JMenuItem("Pegar");
        seleccionarTodo=new JMenuItem("Seleccionar Todo");
        contarPalabras=new JMenuItem("Contar Palabras");
        negro=new JMenuItem("Fondo Negro");
        blanco=new JMenuItem("Fondo Blanco");
        rojo=new JMenuItem("Fondo Rojo");
        
        mb.add(archivo);
        mb.add(edicion);
        mb.add(formato);
        mb.add(apariencia);
        mb.add(ayuda);
        
        archivo.add(abrir);
        archivo.add(salir);
        edicion.add(cortar);
        edicion.add(copiar);
        edicion.add(pegar);
        edicion.add(seleccionarTodo);
        edicion.add(contarPalabras);
        apariencia.add(color);
        color.add(negro);
        color.add(blanco);
        color.add(rojo);
        
        abrir.addActionListener(this);
        salir.addActionListener(this);
        cortar.addActionListener(this);
        copiar.addActionListener(this);
        pegar.addActionListener(this);
        seleccionarTodo.addActionListener(this);
        contarPalabras.addActionListener(this);
        negro.addActionListener(this);
        blanco.addActionListener(this);
        rojo.addActionListener(this);
        
        blocNotas=new JTextArea();
        blocNotas.setBounds(5, 5, 770, 498);
        blocNotas.setLineWrap(true);
        blocNotas.setFont(blocNotas.getFont().deriveFont(18f));
        
        lblPalabras=new JLabel();
        lblCaracteres=new JLabel();
        add(lblPalabras);
        lblPalabras.setBounds(5, 500, 150, 30);
        add(lblCaracteres);
        lblCaracteres.setBounds(100, 500, 150, 30);
        add(mb);
        add(blocNotas);
        setJMenuBar(mb);
    }
    private void examinar() throws IOException {
        JFileChooser examinarArchivos = new JFileChooser();
        int i=examinarArchivos.showOpenDialog(this);
            if(i==JFileChooser.APPROVE_OPTION){
                File fichero = examinarArchivos.getSelectedFile();
                String ficheroPath = fichero.getPath();
            try {
                BufferedReader br = new BufferedReader(new FileReader(ficheroPath));
                String s1="";
                String s2="";
                    while((s1=br.readLine())!=null){
                        s2=s1+"\n";
                    }
                    blocNotas.setText(s2);
                    br.close();
            } catch (Exception ex) {
               ex.printStackTrace();
            }
            }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==abrir){
            try {
                examinar();
            } catch (IOException ex) {
                System.out.println("todo mal");
            }
        }else if(e.getSource()==salir){
            dispose();
        }else if(e.getSource()==cortar){
            blocNotas.cut();
        }else if(e.getSource()==pegar){
            blocNotas.paste();
        }else if(e.getSource()==copiar){
            blocNotas.copy();
        }else if(e.getSource()==seleccionarTodo){
            blocNotas.selectAll();
        }else if(e.getSource()==contarPalabras){
            String texto = blocNotas.getText();
            String words[]=texto.split("\\s");
            lblPalabras.setText("Palabras: "+words.length);
            lblCaracteres.setText("Caracteres: "+texto.length());
        }else if(e.getSource()==negro){
            blocNotas.setBackground(Color.black);
        }else if(e.getSource()==blanco){
            blocNotas.setBackground(Color.white);
        }else if(e.getSource()==rojo){
            blocNotas.setBackground(Color.red);
        }
    }
    
    public static void main(String[] args){
        Eje8_1 ventanaBlocNotas=new Eje8_1();
        ventanaBlocNotas.setLayout(null);
        ventanaBlocNotas.setTitle("Eje8 Menu");
        ventanaBlocNotas.setBounds(0, 0, 800, 600);
        ventanaBlocNotas.setVisible(true);
        ventanaBlocNotas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
}































