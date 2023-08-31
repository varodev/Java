package pooConstructores;

public class E5Password {
	 private int longitud;
	    private String pass;
	    
	    public E5Password(){
	        longitud=8;
	        generarpass();
	    }
	    
	    public E5Password(int longitud){
	        this.longitud=longitud;
	        generarpass();
	    }
	    
	    public E5Password(int longitud,String pass){
	        this.longitud=longitud;
	        this.pass=pass;
	    }
	    
	    public boolean esFuerte(){
	        char letra;
	        int mayus,minus,nums;
	        mayus=minus=nums=0;
	        for(int i=0;i<pass.length();i++){
	            letra=pass.charAt(i);
	            if(letra>='0' && letra<='9') nums++;
	            if(letra>='a' && letra<='z') minus++;
	            if(letra>='A' && letra<='Z') mayus++;            
	        }
	        
	        if (mayus>=2 && minus>=1 && nums>=5) return true;
	        else return false;
	    }
	    
	    private void generarpass(){
	    	pass="";
	        for(int i=1;i<=longitud;i++){
	            int opcion=(int)((Math.random()*3)+1);
	            switch(opcion){
	                case 1:
	                	pass+=(char)((int)
	                                       (Math.random()*(57-48+1)+48));
	                    break;
	                case 2:
	                	pass+=(char)((int)
	                                       (Math.random()*(90-65+1)+65));
	                    break;
	                case 3:
	                	pass+=(char)((int)
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
	    
	    public String getpass(){
	        return pass;
	    }
}
