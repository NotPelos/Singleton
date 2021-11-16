package app;

import app.model.Builder;
import app.model.Persona;
import app.model.PersonaToBuild;
import app.model.Singleton;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton s = Singleton.getInstance(new Persona("Juanito","1345678T"));
		Persona p1 = s.getPersona();
		s = Singleton.getInstance(new Persona("Francisco","87654321Z"));
		Persona p2 = s.getPersona();
		
		System.out.println(p1+" "+p1.getNombre()+" "+p1.getDni());
		System.out.println(p2+" "+p2.getNombre()+" "+p2.getDni());
		Builder builder = new Builder();
		PersonaToBuild pBuild = builder.nombre("Jose Luis").apellidos("Torres").dni("85273641X").build();
		System.out.println(pBuild);
		
	}

}
