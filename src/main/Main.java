package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

import control.ProdutoControler;
import control.UsuarioControler;
import dto.ProdutoDTO;
import dto.UsuarioDTO;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		UsuarioControler usuarioControle = UsuarioControler.getInstaciControler();
		ProdutoControler producteControle = ProdutoControler.getProdutoControlerInstaci();
		
		int option = 0;
		for(;option < 7;) {
			
			System.out.println("Loja----ApplyGoodFriend----:");
			System.out.println("1-Create Usuario");
			System.out.println("2-Create Product");
			System.out.println("3-List all Users");
			System.out.println("4-List all Products");
			System.out.println("5-display user specific");
			System.out.println("6-display Producte specific");
			System.out.println("7- Exit Programe");

			option = Integer.parseInt(scan.nextLine());
			
			switch (option) {
			case 1: 
				System.out.println("Nome:");
				String nome = scan.nextLine();
				System.out.println("Idade:");
				int idade = Integer.parseInt(scan.nextLine());
				System.out.println("HashID:");
				int hashID = Integer.parseInt(scan.nextLine());
				usuarioControle.creatUser(nome, idade, hashID);
				break;
			case 2:
				System.out.println("Nome:");
				String nomeProduct = scan.nextLine();
				System.out.println("Product ID:");
				int idProduct = Integer.parseInt(scan.nextLine());
				System.out.println("Validade:");
				String validade = scan.nextLine();
				DateTimeFormatter parser = new DateTimeFormatterBuilder().appendPattern("dd/MM/yyyy").toFormatter();
				LocalDate dataFormat =  LocalDate.parse(validade,parser);
				System.out.println("Valor do Produto com [Tarifa aplicada]:");
				int valor = Integer.parseInt(scan.nextLine());
				producteControle.creatProduct(nomeProduct, idProduct, dataFormat,valor);
				break;
			case 3: 
				usuarioControle.displayViewUsers();
				break;
			case 4:
				producteControle.displayAllProduct();
				break;
			case 5:// ESTA PARTE ESTA ASSIM PORQUE NAO QUIS MUDAR A FONTE PRA PEGAR O NOME ;[
				System.out.println("Nome do usuario");
				String name = scan.nextLine();
				UsuarioDTO user = new UsuarioDTO();
				user.setNome(name);
				usuarioControle.readUser(user);
				break;
			case 6:
				System.out.println("Nome do producte");
				String nameProducte = scan.nextLine();
				ProdutoDTO producte = new ProdutoDTO();
				producte.setNome(nameProducte);
				producteControle.displayProducte(producte);
				break;
			default:
				System.out.println("END-------------------------");
			}
			
			
		}
		
		
		
	}

}
