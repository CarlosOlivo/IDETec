package idetec;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author edson
 */
public class Usuario {
    
    private String usuario = null;
    private String password = null;
    private String nombre = null;
    private String correo = null;
    
    public Usuario(String us, String ps){
        this.usuario = us;
        this.password = getHash(ps);
    }

    public Usuario(String usuario, String password, String nombre, String correo) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.correo = correo;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getHash(String data) {
    //String result = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(data.getBytes("UTF-8"));

            StringBuilder stringBuilder = new StringBuilder();

            for(int i=0; i<hash.length;i++){
            stringBuilder.append(Integer.toString((hash[i]&0xff)+0x100,16).substring(1));
            }        
            return  stringBuilder.toString();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException ex) {
          return null;
        }
    }
    private String bytesToHex(byte[] hash) {
            return DatatypeConverter.printHexBinary(hash);
    }
    
    public void verificarUsuario(){
        
    }
}
