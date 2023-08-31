package pooConstructores;

public class Password {
	 private int longitud;
	    private String contraseña;
	    
	    public Password(){
	        longitud=8;
	        generarContraseña();
	    }
	    
	    public Password(int longitud){
	        this.longitud=longitud;
	        generarContraseña();
	    }
	    
	    public Password(int longitud,String contraseña){
	        this.longitud=longitud;
	        this.contraseña=contraseña;
	    }
	    
	    public boolean esFuerte(){
	        char letra;
	        int mayus,minus,nums;
	        mayus=minus=nums=0;
	        for(int i=0;i<contraseña.length();i++){
	            letra=contraseña.charAt(i);
	            if(letra>='0' && letra<='9') nums++;
	            if(letra>='a' && letra<='z') minus++;
	            if(letra>='A' && letra<='Z') mayus++;            
	        }
	        
	        if (mayus>=2 && minus>=1 && nums>=5) return true;
	        else return false;
	    }
	    
	    private void generarContraseña(){
	        contraseña="";
	        for(int i=1;i<=longitud;i++){
	            int opcion=(int)((Math.random()*3)+1);
	            switch(opcion){
	                case 1:
	                    contraseña+=(char)((int)
	                                       (Math.random()*(57-48+1)+48));
	                    break;
	                case 2:
	                    contraseña+=(char)((int)
	                                       (Math.random()*(90-65+1)+65));
	                    break;
	                case 3:
	                    contraseña+=(char)((int)
	                                       (Math.random()*(122-97+1)+97));
	                    break;
	            }
	        }
	    }
	    
	   
	
	    public void setLongitud(int longitud){
	        this.longitud=longitud;
	    }
	    
	    public int getLongitud(){
	        return longitud;
	    }
	    
	    public String getContraseña(){
	        return contraseña;
	    }
}
