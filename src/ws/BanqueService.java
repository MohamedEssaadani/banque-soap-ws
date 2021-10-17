package ws;

import model.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {

    @WebMethod(operationName = "conversionEuroToDH")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt * 11;
    }

    public Compte getCompte(@WebParam(name = "code") String code){
        return new Compte(code, Math.random()*90000, new Date());
    }

    public List<Compte> getComptes(){
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte("MM22", Math.random()*90000, new Date()));
        comptes.add(new Compte("SS22", Math.random()*90000, new Date()));
        comptes.add(new Compte("MM99", Math.random()*90000, new Date()));

        return comptes;
    }

}
