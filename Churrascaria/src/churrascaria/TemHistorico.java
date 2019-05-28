package churrascaria;

import java.util.ArrayList;

public interface TemHistorico {
    ArrayList<Mesa> getHistorico(Banco db);
}
