package com.estque;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.estque.Model.Cliente;
import com.estque.Model.Estoque;
import com.estque.Model.Filial;
import com.estque.Model.FormaPagamento;
import com.estque.Model.Fornecedor;
import com.estque.Model.Item;
import com.estque.Model.PedidoEstoque;
import com.estque.Model.Produto;
import com.estque.Model.Usuario;
import com.estque.Model.Venda;
import com.estque.Repository.ClienteRepository;
import com.estque.Repository.EstoqueRepository;
import com.estque.Repository.FilialRepository;
import com.estque.Repository.FormaPgamentoRepository;
import com.estque.Repository.FornecedorRepository;
import com.estque.Repository.ItemRepository;
import com.estque.Repository.PedidoEstoqueRepository;
import com.estque.Repository.ProdutoRepository;
import com.estque.Repository.UsuarioRepository;
import com.estque.Repository.VendaRepository;

@SpringBootApplication
public class ControlEstoqueApplication implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private VendaRepository vendaRepository;
	
	@Autowired
	private ItemRepository itemRepos;
	
	@Autowired
	private FilialRepository filialrepos;
	
	@Autowired
	private UsuarioRepository usuarioRepos;
	
	@Autowired
	private PedidoEstoqueRepository pedidoEstoqueRepos;
	
	@Autowired
	private FornecedorRepository fornecedorRepos;
	
	@Autowired
	private FormaPgamentoRepository formaPagementoRepos;
	
	@Autowired
	private EstoqueRepository estoqueRepos;

	public static void main(String[] args) {
		SpringApplication.run(ControlEstoqueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Cliente cli1 = new Cliente(null, "Livia", "898.900.900-90"); 
		Cliente cli2 = new Cliente(null, "Karmen", "893.930.300-20");
		
		clienteRepository.saveAll(Arrays.asList(cli1,cli2));
		
		Date data = new Date();
		
		Produto prod1 = new Produto(null, data, "Caneta preta", 55.67, "Caneta ponta grossa");
		Produto prod2 = new Produto(null, data, "Caneta azul", 55.66, "Caneta ponta grossa");
		
		produtoRepository.saveAll(Arrays.asList(prod1,prod2));
		
		FormaPagamento formPg1 = new FormaPagamento(null, "Cartão de Crédito");
		FormaPagamento formPg2 = new FormaPagamento(null, "Dinheiro");
		FormaPagamento formPg3 = new FormaPagamento(null, "Boleto");
		
		formaPagementoRepos.saveAll(Arrays.asList(formPg1,formPg2,formPg3));
		
		Usuario user1 = new Usuario(null, "Maria Ines", "Atendente");
		Usuario user2 = new Usuario(null, "João Mesquita", "Atendente");
		
		usuarioRepos.saveAll(Arrays.asList(user1,user2));
		
		Venda venda1 = new Venda(null, data, 10.99, 100.90, cli1,formPg1,user1);
		Venda venda2 = new Venda(null, data, 13.99, 140.90, cli2,formPg3,user2);
		
		vendaRepository.saveAll(Arrays.asList(venda1,venda2));
		
		Filial fil1 = new Filial(null, "Empresa 01", "223.444.444.0009",user1);
		Filial fil2 = new Filial(null, "Empresa 02", "223.444.444.0009", user2);
		
		filialrepos.saveAll(Arrays.asList(fil1,fil2));
		
		Estoque estoque1 = new Estoque(null, data, 23, prod1, fil1);
		Estoque estoque2 = new Estoque(null, data, 63, prod1, fil2);
		
		estoqueRepos.saveAll(Arrays.asList(estoque1,estoque2));
		
		Fornecedor fornecedor1 = new Fornecedor(null, "Comercial Star", "667.9088.001-90");
		Fornecedor fornecedor2 = new Fornecedor(null, "Comercial Luan", "668.9088.001-90");
		
		fornecedorRepos.saveAll(Arrays.asList(fornecedor1,fornecedor2));

		Item it1 = new Item(null, 2, prod1, venda1,fil1);
		Item it2 = new Item(null, 30, prod2, venda2,fil2);
				
		itemRepos.saveAll(Arrays.asList(it1,it2));
		
		PedidoEstoque pedido1  = new PedidoEstoque(null, data, 23, "Entrada", it1, fornecedor1);
		PedidoEstoque pedido2  = new PedidoEstoque(null, data, 33, "Saida", it2, fornecedor2);
		
		pedidoEstoqueRepos.saveAll(Arrays.asList(pedido1,pedido2));

	}

}
