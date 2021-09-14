package com.spritzleaf.puppet.mvc.repository.impl;

import com.spritzleaf.puppet.mvc.constants.POLStates;
import com.spritzleaf.puppet.mvc.model.POL;
import com.spritzleaf.puppet.mvc.repository.POLDao;
import org.springframework.stereotype.Component;

import static java.lang.Math.*;

import java.util.ArrayList;
import java.util.List;

@Component
public class POLDaoImpl implements POLDao {

    private static final String[] companies = new String[]{"Cisco", "Betacom", "Innovery", "Digid", "PanziCompany"};
    private static final String[] codes = new String[]{"abeuhd12", "jkshdka23", "kjshf879", "hskajsj29", "shfjs989", "jhdk873"};
    private static final String[] causes = new String[]{"pagamento prima rata", "pagamento fattoria", "pagamento vaccini", "pagamento mucche", "pagamento fagioli"};
    private static final List<POL> lista = new ArrayList<>();

    @Override
    public List<POL> findAll() {
        if (lista.isEmpty()) {
            for (int i = 0; i < 10; i++) {
                lista.add(generaRandomPOL());
            }
        }
        return lista;
    }

    private POL generaRandomPOL() {
        return POL.builder()
                .amount((long) (1000 + random() * 2000))
                .polCode(getRandomValue(codes))
                .company(getRandomValue(companies))
                .causale(getRandomValue(causes))
                .stato(getRandomState())
                .build();
    }

    private String getRandomValue(String[] arr) {
        return arr[(int) (random() * arr.length)];
    }

    private POLStates getRandomState() {
        return POLStates.values()[(int) (random() * POLStates.values().length)];
    }
}
