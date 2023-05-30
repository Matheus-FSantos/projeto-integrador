package br.com.senacsp.projetointegrador.model.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.function.Consumer;

import br.com.senacsp.projetointegrador.model.dto.AddressDTO;

public class ViaCEP {
    
    public static AddressDTO getCep(String cep){
        
        String json;        

        try {
            URL url = new URL("http://viacep.com.br/ws/"+ cep +"/json");
            URLConnection urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            final StringBuilder jsonSb = new StringBuilder();
            
            br.lines().forEach(new Consumer<String>() {
				public void accept(String l) {
					jsonSb.append(l.trim());
				}
			});
            json = jsonSb.toString();
            
            json = json.replaceAll("[{},:]", "");
            json = json.replaceAll("\"", "\n");                       
            String array[] = new String[30];
            array = json.split("\n");
                             
            String address = array[7];
            String state = array[19]; 
            String uf = array[23];
            
            is.close();
            br.close();
            
            return new AddressDTO(address, state, uf, cep);
        } catch (Exception e) {
            return null;
        }
        
    }
    
}
