
package gastronomia;

import Petit.Administrador;
import Petit.Caixa;
import Petit.Cliente;
public class Gastronomia {

    public static void main(String[] args) {
        Administrador administrador = new Administrador ();
	administrador.codigo = (88);
	administrador.endereco = "Rua 230 - Maringá";
	administrador.liberar = "Sistema não liberado";
	administrador.vender = 90;
	administrador.cobrar = 100;
	administrador.vender (34);
	administrador.cobrar (124);
        administrador.cadastrar = "O seu cadastro foi finalizado com sucesso";
	
        Caixa caixa1 = new Caixa ();
        caixa1.setNome ("Paulo");
        caixa1.setCodigo (222);
        caixa1.setelefone (333);
        
        Caixa caixa2 = new Caixa ();
	caixa2.codigo = (4444);
	caixa2.nome = "Paulo";
	caixa2.calcular = 34;
	caixa2.calcular (20);
        
        Cliente cliente = new Cliente ();
	cliente.codigo = (66);
	cliente.pagar = 70;
	cliente.pagar (10);
	
        System.out.println (caixa1.nome);
        System.out.println (caixa1.codigo);
        System.out.println (caixa1.telefone);
	System.out.println (caixa2.calcular);
        System.out.println (cliente.pagar);
        System.out.println (administrador.endereco);
	System.out.println (administrador.codigo);
	System.out.println (administrador.cadastrar);
	System.out.println (administrador.liberar);
	
	
	
        
        
        
                 
        
    }

    }

