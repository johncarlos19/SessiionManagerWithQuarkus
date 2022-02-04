package org.acme;

import org.acme.util.Login;
import org.acme.util.VentasSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SessionManager {

    private static SessionManager sessionManager;
    private Map<String, Login> logins = new HashMap<String, Login>();
    //    private ArrayList<Login> logins = new ArrayList<Login>();
    private long timeSessionMinute = 10;
    public List<VentasSession> listaSseUsuario = new ArrayList<VentasSession>();

    public static SessionManager getInstance() {
        if (sessionManager == null)
            sessionManager = new SessionManager();
        return sessionManager;
    }


    public void borrarSessionSSe(String id){
        int borrar = -1;
        for (int i = 0; i < listaSseUsuario.size(); i++) {
            try {
                if (id.equalsIgnoreCase(listaSseUsuario.get(i).getIdSession())){
                    borrar = i;
                    break;
                }
            }catch (IllegalStateException e){
                e.printStackTrace();
                borrar = i;
                break;
            }

        }
        if (borrar!=-1){
            listaSseUsuario.remove(borrar);
            System.out.println("\n\nelimino");
        }
    }

    public Map<String, Login> getLogins() {
        return logins;
    }

    public void setLogins(Map<String, Login> logins) {
        this.logins = logins;
    }

    public List<VentasSession> getListaSseUsuario() {
        return listaSseUsuario;
    }

    public void setListaSseUsuario(List<VentasSession> listaSseUsuario) {
        this.listaSseUsuario = listaSseUsuario;
    }
}
