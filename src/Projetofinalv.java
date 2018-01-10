
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Projetofinalv {
	static Scanner teclado = new Scanner(System.in);
	static final String[] ficheiros = {"automotora.txt", "carruagens.txt", "linhas.txt", "estacoes.txt",  "composicoes.txt", "estaleirocarr.txt","estaleiroauto.txt"};
	static File ficheiro;
	static String dadosautomotora[][]=new String[0][2];
	static String dadoscarruagem[][]= new String[0][2];	
	static String dadoscomposicoes[][]=new String[0][10];
	static String dadosestacoes[][]=new String[0][3];
	static String dadoslinhas[][]=new String[0][4];
	static String dadosestaleiro[][]=new String[0][4];
	static String NomeFicheiro_carruagem = "carruagens.txt";
	static String NomeFicheiro_automotora = "automotora.txt";
	static String NomeFicheiro_estacoes = "estacoes.txt";
	static String NomeFicheiro_linhas = "linhas.txt";
	static String NomeFicheiro_composicoes= "composicoes.txt";
	static String NomeFicheiro_estaleiro= "estaleiro.txt";
	//@TODO Guardar do array para o ficheir quando terminar progroma apagar o que esta no ficheiro e passar o que esta no array

	public static void main(String[] args) throws Exception {


//Inicialização dos dados a partir do ficheiro
		dadoscarruagem=lerFicheirocarruagem();
		dadosautomotora=lerFicheiroautomotora();
		dadosestacoes=lerFicheiroestacoes();
		dadoslinhas=lerFicheirolinhas();	
		dadosestaleiro=lerFicheiroestaleiro();
		dadoscomposicoes=lerFicheirocomposicoes();
				
		
		for (int i=0; i<ficheiros.length;i++) {
			ficheiro = new File(ficheiros[i]);

			if (!ficheiro.exists()) {
				criarFicheiro(ficheiros[i]);
			}

		}

		int escolha = 0;

		do {
			System.out.println("*************************************************");
			System.out.println("\t\tMETROCOIMBRA SA");
			System.out.println("*************************************************\n");

			menuprincipal();
		}while (escolha !=8) ;
	}

	

	public static String [][] lerFicheirocarruagem(){

		try{
			File ficheiro = new File(NomeFicheiro_carruagem);

			if (!ficheiro.exists()) {
				ficheiro.createNewFile(); 
			}
		}catch(IOException e) {
			System.out.println("Ocorreu um erro durante a criação do ficheiro! [DEBUG: "+e.getMessage()+"]");
			System.out.println("Tente de novo!");
			lerFicheirocarruagem();
		}
		try {
			File file = new File(NomeFicheiro_carruagem);
			Scanner sc1 = new Scanner(file);

			int numLinhas = 0;
			while(sc1.hasNextLine()) {
				numLinhas++;
				sc1.nextLine();
			}
			sc1.close();

			sc1 = new Scanner(file);

			dadoscarruagem = new String[numLinhas][2];

			for(int i=0; sc1.hasNextLine(); i++)
			{
				String line = sc1.nextLine();
				dadoscarruagem[i][0] = String.valueOf((line.split(";")[0]));
				dadoscarruagem[i][1] = String.valueOf((line.split(";")[1]));

			}
			sc1.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ocorreu um erro durante a leitura do ficheiro! [DEBUG: "+e.getMessage()+"]");
		}

		return dadoscarruagem;
	}

	public static String [][] lerFicheiroautomotora(){

		try{
			File ficheiro = new File(NomeFicheiro_automotora);

			if (!ficheiro.exists()) {
				ficheiro.createNewFile(); 
			}
		}catch(IOException e) {
			System.out.println("Ocorreu um erro durante a criação do ficheiro! [DEBUG: "+e.getMessage()+"]");
			System.out.println("Tente de novo!");
			lerFicheiroautomotora();
		}
		try {
			File file = new File(NomeFicheiro_automotora);
			Scanner sc1 = new Scanner(file);

			int numLinhas = 0;
			while(sc1.hasNextLine()) {
				numLinhas++;
				sc1.nextLine();
			}
			sc1.close();

			sc1 = new Scanner(file);

			dadosautomotora = new String[numLinhas][2];

			for(int i=0; sc1.hasNextLine(); i++)
			{
				String line = sc1.nextLine();
				dadosautomotora[i][0] = String.valueOf((line.split(";")[0]));
				dadosautomotora[i][1] = String.valueOf((line.split(";")[1]));

			}
			sc1.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ocorreu um erro durante a leitura do ficheiro! [DEBUG: "+e.getMessage()+"]");
		}

		return dadosautomotora;
	}
	public static String [][] lerFicheiroestacoes(){

		try{
			File ficheiro = new File(NomeFicheiro_estacoes);

			if (!ficheiro.exists()) {
				ficheiro.createNewFile(); 
			}
		}catch(IOException e) {
			System.out.println("Ocorreu um erro durante a criaçãoo do ficheiro! [DEBUG: "+e.getMessage()+"]");
			System.out.println("Tente de novo!");
			lerFicheiroestacoes();
		}
		try {
			File file = new File(NomeFicheiro_estacoes);
			Scanner sc1 = new Scanner(file);

			int numLinhas = 0;
			while(sc1.hasNextLine()) {
				numLinhas++;
				sc1.nextLine();
			}
			sc1.close();

			sc1 = new Scanner(file);

			dadosestacoes = new String[numLinhas][3];

			for(int i=0; sc1.hasNextLine(); i++)
			{
				String line = sc1.nextLine();
				dadosestacoes[i][0] = String.valueOf((line.split(";")[0]));
				dadosestacoes[i][1] = String.valueOf((line.split(";")[1]));
				dadosestacoes[i][2] = String.valueOf((line.split(";")[2]));
			}
			sc1.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ocorreu um erro durante a leitura do ficheiro! [DEBUG: "+e.getMessage()+"]");
		}

		return dadosestacoes;
	}
	public static String [][] lerFicheirolinhas(){

		try{
			File ficheiro = new File(NomeFicheiro_linhas);

			if (!ficheiro.exists()) {
				ficheiro.createNewFile(); 
			}
		}catch(IOException e) {
			System.out.println("Ocorreu um erro durante a criação do ficheiro! [DEBUG: "+e.getMessage()+"]");
			System.out.println("Tente de novo!");
			lerFicheirolinhas();
		}
		try {
			File file = new File(NomeFicheiro_linhas);
			Scanner sc1 = new Scanner(file);

			int numLinhas = 0;
			while(sc1.hasNextLine()) {
				numLinhas++;
				sc1.nextLine();
			}
			sc1.close();

			sc1 = new Scanner(file);

			dadoslinhas = new String[numLinhas][3];

			for(int i=0; sc1.hasNextLine(); i++)
			{
				String line = sc1.nextLine();
				dadoslinhas[i][0] = String.valueOf((line.split(";")[0]));
				dadoslinhas[i][1] = String.valueOf((line.split(";")[1]));
				dadoslinhas[i][2] = String.valueOf((line.split(";")[2]));
			}
			sc1.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ocorreu um erro durante a leitura do ficheiro! [DEBUG: "+e.getMessage()+"]");
		}

		return dadoslinhas;
	}
	public static String [][] lerFicheirocomposicoes(){
	try{
		File ficheiro = new File(NomeFicheiro_composicoes);

		if (!ficheiro.exists()) {
			ficheiro.createNewFile(); 
		}
	}catch(IOException e) {
		System.out.println("Ocorreu um erro durante a criaçãoo do ficheiro! [DEBUG: "+e.getMessage()+"]");
		System.out.println("Tente de novo!");
		lerFicheirocomposicoes();
	}
	try {
		File file = new File(NomeFicheiro_composicoes);
		Scanner sc1 = new Scanner(file);

		int numLinhas = 0;
		while(sc1.hasNextLine()) {
			numLinhas++;
			sc1.nextLine();
		}
		sc1.close();

		sc1 = new Scanner(file);

		dadoscomposicoes = new String[numLinhas][10];


		for(int i=0; sc1.hasNextLine(); i++)
		{
			
			String line = sc1.nextLine();
			String tempArray[]= line.split(";") ;
		for(int j=0; j< dadoscomposicoes.length;j++) {	
			
			if(j<tempArray.length)
				dadoscomposicoes[i][j] = String.valueOf((line.split(";")[0]));
			else
				dadoscomposicoes[i][j] = "";
			
		}
		}
		sc1.close();
	} catch (FileNotFoundException e) {
		System.out.println("Ocorreu um erro durante a leitura do ficheiro! [DEBUG: "+e.getMessage()+"]");
	}

	return dadoscomposicoes;
	}

	public static String [][] lerFicheiroestaleiro(){

		try{
			File ficheiro = new File(NomeFicheiro_estaleiro);

			if (!ficheiro.exists()) {
				ficheiro.createNewFile(); 
			}
		}catch(IOException e) {
			System.out.println("Ocorreu um erro durante a criação do ficheiro! [DEBUG: "+e.getMessage()+"]");
			System.out.println("Tente de novo!");
			lerFicheiroestaleiro();
		}
		try {
			File file = new File(NomeFicheiro_estaleiro);
			Scanner sc1 = new Scanner(file);

			int numLinhas = 0;
			while(sc1.hasNextLine()) {
				numLinhas++;
				sc1.nextLine();
			}
			sc1.close();

			sc1 = new Scanner(file);

			dadosestaleiro = new String[numLinhas][4];

			for(int i=0; sc1.hasNextLine(); i++)
			{
				String line = sc1.nextLine();
				dadosestaleiro[i][0] = String.valueOf((line.split(";")[0]));
				dadosestaleiro[i][1] = String.valueOf((line.split(";")[1]));
				dadosestaleiro[i][2] = String.valueOf((line.split(";")[2]));
				dadosestaleiro[i][3] = String.valueOf((line.split(";")[3]));

			}
			sc1.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ocorreu um erro durante a leitura do ficheiro! [DEBUG: "+e.getMessage()+"]");
		}

		return dadosestaleiro;
	}

	public static void criarFicheiro(String nome) {
		try {
			ficheiro = new File(nome);

			if (ficheiro.createNewFile()) {
				System.out.println("Ficheiro criado com sucesso!");
			} else {
				System.out.println("Erro ao tentar criar o ficheiro!");
			}
		} catch(IOException e) {
			System.out.println("Erro na aplicação!");
			e.printStackTrace();
		}
	}

	public static void menuprincipal() throws Exception {
		int escolha;
		System.out.println("*************************************************");
		System.out.println("\t\tMenu Principal");
		System.out.println("*************************************************");
		System.out.println("1. Listar Empresa");
		System.out.println("2. Gerir Automotora/Carruagem");
		System.out.println("3. Gerir Estaleiro");
		System.out.println("4. Gerir Composição Do Metro");
		System.out.println("5. Gerir Estação/Linha");
		System.out.println("6. Gerir Movimento");
		System.out.println("7. Obter Estatística");
		System.out.println("8. Sair Do Programa");
		System.out.println("*************************************************\n");
		escolha = teclado.nextInt();
		do {
			switch(escolha) {
			case 1:
				menu2();
				break;
			case 2:
				menu3();
				break;
			case 3:
				menu4();
				break;
			case 4:
				menu5();
				break;
			case 5:
				menu6();
				break;
			case 6:
				menu7();
				break;
			case 7:
				menu8();
				break;
			case 8:
				menusair();
				break;
			}
		}while (escolha != 8);




	}
	public static void menu2() throws Exception {
		int escolha;
		System.out.println("*************************************************");
		System.out.println("\t\tMenu lista empresa");
		System.out.println("*************************************************");
		System.out.println("1. Listar todas as composições do metro");
		System.out.println("2. Listar todas as automotoras/carruagens");
		System.out.println("3. Listar automotoras/carruagens livres");
		System.out.println("4. Listar automotoras/carruagens ocupadas");
		System.out.println("5. Pesquisar automotora/carruagem");
		System.out.println("6. Voltar ao menu anterior");
		System.out.println("*************************************************\n");
		escolha = teclado.nextInt();
		switch(escolha) {
		case 1:
			listartodascomp();
			break;
		case 2:
			listartodosautocarru();
			break;
		case 3:
			listarautocarrulivres();
			break;
		case 4:
			listarautocarruocupadas();
			break;
		case 5:
			pesquisarautocaru();
			break;
		case 6:
			menuprincipal();
			break;
		}


	}

	private static void pesquisarautocaru() throws Exception {
		int escolha;
		System.out.println("*************************************************");
		System.out.println("\t\tPesquisar automotoras/carruagens");
		System.out.println("*************************************************");
		System.out.println("1. Pesquisar todas as automotoras");
		System.out.println("2. Pesquisar todas as carruagens");
		System.out.println("3. Voltar ao menu anterior");
		System.out.println("*************************************************\n");
		escolha = teclado.nextInt();

		switch(escolha) {
		case 1:
			pesquisaauto();
			break;
		case 2:
			pesquisacarr();
			break;
		case 3:
			menu2();
			break;
		}
	}

	private static void listarautocarruocupadas() throws Exception {
		
	}
	private static void pesquisacarr() throws Exception {
		int numero = 0;
		String indiceElemento = null;
		try
		{
			System.out.print("Qual o valor a procurar: ");
			String valorProcurar = teclado.next();

			for (int i=0; i<dadoscarruagem.length;i++){
				for (int j=0; j<dadoscarruagem[0].length; j++) {
					if (dadoscarruagem[i][0].equals(valorProcurar)) {
						indiceElemento = "["+i+"]["+0+"]";
					}
				}
			}
			for (int i=0; i<dadoscarruagem.length;i++){
				for (int j=0; j<dadoscarruagem[1].length; j++) {
					if (dadoscarruagem[i][1].equals(valorProcurar)) {
						indiceElemento = "["+0+"]["+i+"]";
					}
				}
			}

			if (indiceElemento == null) {
				System.out.println("Valor não encontrado...");
			} else {
				System.out.println("O valor "+valorProcurar+" foi encontrado na posição "+indiceElemento);
			}
		} catch(Exception e) {
			System.out.println("Ocorreu um erro na leitura dos dados... [DEBUG: "+e.getMessage()+"]");
		}		
		do{
			System.out.println("Prima 1 para pesquisar uma nova carruagem ou 0 para voltar.");
			numero=teclado.nextInt();
			if(numero==1) {
				pesquisacarr();
			}
			if(numero==0) {
				pesquisarautocaru();

			}
			if(numero!=0&&numero!=1){
				System.out.println("Apenas pode inserir 0 ou 1");
				numero=2;
			}

		}while(numero==2);

	}



	private static void pesquisaauto() throws Exception {
		int numero = 0;
		String indiceElemento = null;
		try
		{
			System.out.print("Qual o valor a procurar: ");
			String valorProcurar = teclado.next();

			for (int i=0; i<dadosautomotora.length;i++){
				for (int j=0; j<dadosautomotora[0].length; j++) {
					if (dadosautomotora[i][0].equals(valorProcurar)) {
						indiceElemento = "["+i+"]["+0+"]";
					}
				}
			}
			for (int i=0; i<dadosautomotora.length;i++){
				for (int j=0; j<dadosautomotora[1].length; j++) {
					if (dadosautomotora[i][1].equals(valorProcurar)) {
						indiceElemento = "["+0+"]["+i+"]";
					}
				}
			}

			if (indiceElemento == null) {
				System.out.println("Valor não encontrado...");
			} else {
				System.out.println("O valor "+valorProcurar+" foi encontrado na posição "+indiceElemento);
			}
		} catch(Exception e) {
			System.out.println("Ocorreu um erro na leitura dos dados... [DEBUG: "+e.getMessage()+"]");
		}
		do{
			System.out.println("Prima 1 para pesquisar uma nova automotora ou 0 para voltar.");
			numero=teclado.nextInt();
			if(numero==1) {
				pesquisaauto();
			}
			if(numero==0) {
				pesquisarautocaru();

			}
			if(numero!=0&&numero!=1){
				System.out.println("Apenas pode inserir 0 ou 1");
				numero=2;
			}

		}while(numero==2);
			
		
	}		
	



	private static void listarautocarrulivres() throws Exception {
		int escolha;
		System.out.println("*************************************************");
		System.out.println("\t\tListar automotoras/carruagens Livres");
		System.out.println("*************************************************");
		System.out.println("1. Listar as automotoras livres");
		System.out.println("2. Listar as carruagens livres");
		System.out.println("3. Voltar ao menu anterior");
		System.out.println("*************************************************\n");
		escolha = teclado.nextInt();

		switch(escolha) {
		case 1:
			listarautolivre();
			break;
		case 2:
			listarcarrlivre();
			break;
		case 3:
			menu2();
			break;
		}
	}
	private static void listarautolivre() {
		

	}



	private static void listarcarrlivre() {
		

		
	}



	private static void listartodosautocarru() throws Exception {
		int escolha;
		System.out.println("*************************************************");
		System.out.println("\t\tListar automotoras/carruagens");
		System.out.println("*************************************************");
		System.out.println("1. Listar todas as automotoras");
		System.out.println("2. Listar todas as carruagens");
		System.out.println("3. Voltar ao menu anterior");
		System.out.println("*************************************************\n");
		escolha = teclado.nextInt();

		switch(escolha) {
		case 1:
			listarauto();
			break;
		case 2:
			listarcarr();
			break;
		case 3:
			menu2();
			break;
		}
	}
	public static void listarcarr()  {

		int sizeofCarrugens =dadoscarruagem.length;


		for(int i=0; i<sizeofCarrugens; i++){

			System.out.println(dadoscarruagem[i][0] +" : "+dadoscarruagem[i][1]);

		}

	}
	public static void listarauto() throws Exception {
		int sizeofAutomotora =dadosautomotora.length;


		for(int i=0; i<sizeofAutomotora; i++){

			System.out.println(dadosautomotora[i][0] +" : "+dadosautomotora[i][1]);
		}
	}
		private static void listartodascomp() {

		}

		public static void menu3() throws Exception {
			int escolha;
			System.out.println("*************************************************");
			System.out.println("\t\tMenu gerir automotora/carruagem");
			System.out.println("*************************************************");
			System.out.println("1. Criar automotora/carruagem");
			System.out.println("2. Alterar automotora/carruagem");
			System.out.println("3. Remover automotora/carruagem");
			System.out.println("4. Listar automotoras/carruagens");
			System.out.println("5. Voltar ao menu anterior");
			System.out.println("*************************************************\n");
			escolha = teclado.nextInt();
				switch(escolha) {
				case 1:
					criarautocarru();
					break;
				case 2:
					alterarautocarru();
					break;
				case 3:
					removerautocarru();
					break;
				case 4:
					listartodosautocarru();
					break;
				case 5:
					menuprincipal();
					break;
				}
		}
		private static void criarautocarru() throws Exception {
			int escolha;
			System.out.println("*************************************************");
			System.out.println("\t\tCriar automotoras/carruagens");
			System.out.println("*************************************************");
			System.out.println("1. Criar automotora");
			System.out.println("2. Criar carruagem");
			System.out.println("3. Voltar ao menu anterior");
			System.out.println("*************************************************\n");
			escolha = teclado.nextInt();

			switch(escolha) {
			case 1:
				criarautomotora();
				break;
			case 2:
				criarcarruagem();
				break;
			case 3:
				menu3();
				break;}
		}





		private static void criarcarruagem() {
			int numero=1;
			do{

				String tmpArray[][] = new String[dadoscarruagem.length+1][2];

				for(int i=0; i<dadoscarruagem.length;i++) 
				{
					tmpArray[i][0]=dadoscarruagem[i][0];
					tmpArray[i][1]=dadoscarruagem[i][1];
				}

				System.out.println("Insira Carruagem");

				tmpArray[tmpArray.length-1][0]= teclado.next();

				System.out.println("Insira o número de passageiros");

				tmpArray[tmpArray.length-1][1]= teclado.next();

				dadoscarruagem=tmpArray;
				
				
				
				

				do{
					System.out.println("Prima 1 para inserir uma nova carruagem ou 0 para voltar.");
					numero=teclado.nextInt();
					if(numero!=0&&numero!=1){
						System.out.println("Apenas pode inserir 0 ou 1");
						numero=2;
					}

				}while(numero==2);

			}while(numero!=0);

		}



		private static void criarautomotora() {
			int numero=1;
			do{

				String tmpArray[][] = new String[dadosautomotora.length+1][2];


				for(int i=0; i<dadosautomotora.length;i++) 
				{
					tmpArray[i][0]=dadosautomotora[i][0];
					tmpArray[i][1]=dadosautomotora[i][1];
				}

				System.out.println("Insira a Automotora");


				tmpArray[tmpArray.length-1][0]= teclado.next();

				System.out.println("Insira o tipo de Automotora");


				tmpArray[tmpArray.length-1][1]= teclado.next();


				dadosautomotora=tmpArray;
				

				do{
					System.out.println("Prima 1 para inserir uma nova carruagem ou 0 para voltar.");
					numero=teclado.nextInt();
					if(numero!=0&&numero!=1){
						System.out.println("Apenas pode inserir 0 ou 1");
						numero=2;
					}

				}while(numero==2);

			}while(numero!=0);

		}




	
		private static void removerautocarru() throws Exception {
			int escolha;
			System.out.println("*************************************************");
			System.out.println("\t\tRemover automotoras/carruagens");
			System.out.println("*************************************************");
			System.out.println("1. Remover automotora");
			System.out.println("2. Remover carruagem");
			System.out.println("3. Voltar ao menu anterior");
			System.out.println("*************************************************\n");
			escolha = teclado.nextInt();

			switch(escolha) {
			case 1:
				removerautomotora();
				break;
			case 2:
				removercarruagem();
				break;
			case 3:
				menu3();
				break;}

		}

		private static void removercarruagem() {

			String carruagem;
			String tmpArray[][]= new String[dadoscarruagem.length-1][2];



			
			System.out.println("ID	 | Número de Passageiros");
			for (int i = 0; i<dadoscarruagem.length; i++){
				if(dadoscarruagem[i][0].compareToIgnoreCase("0")!=0){
					System.out.println(dadoscarruagem[i][0]+ "  | " + dadoscarruagem[i][1]);
				}
			}
			System.out.println("Insira o ID da carruagem que pretende remover");
			carruagem=teclado.next();
			int i=0;

			for(int j=0;j<dadoscarruagem.length;j++){
				

				if(dadoscarruagem[j][0].equalsIgnoreCase(carruagem)){
					continue;
				}

				tmpArray[i][0]= dadoscarruagem[j][0];
				tmpArray[i][1]= dadoscarruagem[j][1];
				i++;	
			}
			dadoscarruagem=tmpArray;

		}
		private static void removerautomotora() {

			String automotora;
			String tmpArray[][]= new String[dadosautomotora.length-1][2];
			System.out.println("ID	 | Tipo de Automotora");
			for (int i = 0; i<dadosautomotora.length; i++){
				if(dadosautomotora[i][0].compareToIgnoreCase("0")!=0){
					System.out.println(dadosautomotora[i][0]+ "  | " + dadosautomotora[i][1]);
				}
			}
			System.out.println("Insira o ID da automotora que pretende remover");
			automotora=teclado.next();
			int i=0;
			for(int j=0;j<dadosautomotora.length;j++){

				if(dadosautomotora[j][0].equalsIgnoreCase(automotora)){
					continue;
				}
				tmpArray[i][0]= dadosautomotora[j][0];
				tmpArray[i][1]= dadosautomotora[j][1];
				i++;	
			}
			dadosautomotora=tmpArray;

		}
		private static void alterarautocarru() throws Exception {
			int escolha;
			System.out.println("*************************************************");
			System.out.println("\t\tAlterar automotoras/carruagens");
			System.out.println("*************************************************");
			System.out.println("1. Alterar automotora");
			System.out.println("2. Alterar carruagem");
			System.out.println("3. Voltar ao menu anterior");
			System.out.println("*************************************************\n");
			escolha = teclado.nextInt();

			switch(escolha) {
			case 1:
				alterarautomotora();
				break;
			case 2:
				alterarcarruagem();
				break;
			case 3:
				menu3();
				break;}

		}
		private static void alterarcarruagem() {

			String carruagem;
			String alteracao;
			
				System.out.println("Insira o ID da carruagem que pretende alterar");
				System.out.println("ID     | Numero de Passageiros");
				for (int i = 0; i<dadoscarruagem.length; i++){
					if(dadoscarruagem[i][0].compareToIgnoreCase("0")!=0)
						System.out.println(dadoscarruagem[i][0]+ "  | " + dadoscarruagem[i][1]);
				}	
				carruagem=teclado.next();
				for(int h=0;h<dadoscarruagem.length;h++){
					if(carruagem.equals(dadoscarruagem[h][0])){
						System.out.println("Insira o novo número de passageiros");
						alteracao=teclado.next();
						for(int j=0;j<dadoscarruagem.length;j++){
							if(dadoscarruagem[j][0].equalsIgnoreCase(carruagem)){
								dadoscarruagem[j][1]=alteracao;

							}
						}
					}
				}
		}
		private static void alterarautomotora() {
			String automotora;
			String alteracao;
			boolean correto=false;
			do{
				System.out.println("Insira o ID da automotora que pretende alterar");
				System.out.println("ID     | Tipo de Automotora");
				for (int i = 0; i<dadosautomotora.length; i++){
					if(dadosautomotora[i][0].compareToIgnoreCase("0")!=0)
						System.out.println(dadosautomotora[i][0]+ "  | " + dadosautomotora[i][1]);
				}	
				automotora=teclado.next();
				for(int h=0;h<dadosautomotora.length;h++){
					if(automotora.equals(dadosautomotora[h][0])){
						correto=true;
						System.out.println("Insira o novo tipo");
						alteracao=teclado.next();
						for(int j=0;j<dadosautomotora.length;j++){
							if(dadosautomotora[j][0].equalsIgnoreCase(automotora)){
								dadosautomotora[j][1]=alteracao;

							}
						}
					}else{
						correto=false;
					}
				}
			}while(correto==false);
		}





		public static void menu4() throws Exception {
			int escolha;
			System.out.println("*************************************************");
			System.out.println("\t\tMenu Gerir Estaleiro");
			System.out.println("*************************************************");
			System.out.println("1. Inserir automotora/carruagem no estaleiro");
			System.out.println("2. Remover automotora/carruagem");
			System.out.println("3. Listar automotora/carruagem");
			System.out.println("4. Voltar ao menu anterior");
			System.out.println("*************************************************\n");
			escolha = teclado.nextInt();
				switch(escolha) {
				case 1:
					inserirautocarruetsa();
					break;
				case 2:
					removerautocarruesta();
					break;
				case 3:
					listarautocarruesta();
					break;
				case 4:
					menuprincipal();
					break;
				}
		}
		private static void listarautocarruesta() throws Exception {
			int escolha;
			System.out.println("*************************************************");
			System.out.println("\t\tListar automotoras/carruagens no estaleiro");
			System.out.println("*************************************************");
			System.out.println("1. Listar todas as automotoras no estaleiro");
			System.out.println("2. Listar todas as carruagens no estaleiro");
			System.out.println("3. Voltar ao menu anterior");
			System.out.println("*************************************************\n");
			escolha = teclado.nextInt();

			switch(escolha) {
			case 1:
				listarautoesta();
				break;
			case 2:
				listarcarresta();
				break;
			case 3:
				menu4();
				break;
			}
		}
		private static void listarcarresta() {

			int sizeofcarrestaleiro = dadosestaleiro.length;


			for(int i=0; i<sizeofcarrestaleiro; i++){

				System.out.println(dadosestaleiro[i][0] +" | "+dadosestaleiro[i][1]);
			}
	
		}



		private static void listarautoesta() {
			int sizeofautoestaleiro = dadosestaleiro.length;


			for(int i=0; i<sizeofautoestaleiro; i++){

				System.out.println(dadosestaleiro[i][2] +" | "+dadosestaleiro[i][3]);
			}		
		}



		private static void removerautocarruesta() throws Exception {
			int escolha;
			System.out.println("*************************************************");
			System.out.println("\t\tRemover automotoras/carruagens no estaleiro");
			System.out.println("*************************************************");
			System.out.println("1. Remover automotora no estaleiro");
			System.out.println("2. Remover carruagem no estaleiro");
			System.out.println("3. Voltar ao menu anterior");
			System.out.println("*************************************************\n");
			escolha = teclado.nextInt();

			switch(escolha) {
			case 1:
				removerautomotoraestaleiro();
				break;
			case 2:
				removercarruagemestaleiro();
				break;
			case 3:
				menu4();
				break;}

		}
		private static void removerautomotoraestaleiro() {
			
		}



		private static void removercarruagemestaleiro() {
			
		}



		private static void inserirautocarruetsa() throws Exception {
			int escolha;
			System.out.println("*************************************************");
			System.out.println("\t\tInserir automotoras/carruagens no estaleiro");
			System.out.println("*************************************************");
			System.out.println("1. Inserir automotora no estaleiro");
			System.out.println("2. Inserir carruagem no estaleiro");
			System.out.println("3. Voltar ao menu anterior");
			System.out.println("*************************************************\n");
			escolha = teclado.nextInt();

			switch(escolha) {
			case 1:
				inserirautomotoraestaleiro();
				break;
			case 2:
				inserircarruagemestaleiro();
				break;
			case 3:
				menu4();
				break;}
		}
		private static void inserircarruagemestaleiro() {
			
		}



		private static void inserirautomotoraestaleiro() {
			
		}
		


		public static void menu5() throws Exception {
			int escolha;
			System.out.println("*************************************************");
			System.out.println("\t\tMenu gerir composições do metro");
			System.out.println("*************************************************");
			System.out.println("1. Criar composição do metro");
			System.out.println("2. Associar automotora/carruage");
			System.out.println("3. Alterar composição do metro");
			System.out.println("4. Alterar associação de uma automotora/carruagem");
			System.out.println("5. Remover composição do metro");
			System.out.println("6. Remover associação de uma automotora/carruagem");
			System.out.println("7. Voltar ao menu anterior");
			System.out.println("*************************************************\n");
			escolha = teclado.nextInt();
				switch(escolha) {
				case 1:
					criarcompmetro();
					break;
				case 2:
					associarautocarru();
					break;
				case 3:
					altecompmetro();
					break;
				case 4:
					alteassoautocarru();
					break;
				case 5:
					remocompmetro();
					break;
				case 6:
					remoassoautocarru();
					break;
				case 7:
					menuprincipal();
					break;
				}
		}
		private static void remoassoautocarru() {
			//@TODO Fazer
		}
		private static void remocompmetro() {
			//@TODO Fazer
		}
		private static void alteassoautocarru() {
			//@TODO Fazer
			
		}
		private static void altecompmetro() {
			//@TODO Fazer
			
		}
		private static void associarautocarru() {
			//@TODO Fazer
			
		}
		private static void criarcompmetro() {
			//@TODO Fazer
			int numero=1;
			
			do{

				String tmpArray[][] = new String[dadoscomposicoes.length+1][10];

				for(int i=0; i < dadoscomposicoes.length ;i++) 
				{
					tmpArray[i] = dadoscomposicoes[i];
				
				}

				System.out.println("Insira o ID da Composição");

				tmpArray[tmpArray.length-1][0]= teclado.next();

				
				
				for(int i=0; i<dadosautomotora.length; i++) 
				{
					System.out.println(dadosautomotora[i][0] +":"+ dadosautomotora[i][1]);
				}
				System.out.println("Insira a Automotora");

				tmpArray[tmpArray.length-1][1]= teclado.next();
				
				//verifica se existe
				for(int i=0; i<dadosautomotora[i].length;i++) 
				{
					if(dadosautomotora[i][0].equalsIgnoreCase(tmpArray[tmpArray.length-1][1])) 
					{
						tmpArray[tmpArray.length-1][2]= dadosautomotora[i][0];
						
					}
				}
				
			

				dadoscomposicoes=tmpArray;

				do{

					
					System.out.println("Introduza o id dacaruagem que pretende adicionar...");

					String tmpArray2[]= tmpArray[tmpArray.length-1];

					tmpArray2[tmpArray.length]= teclado.next();

					System.out.println("Prima 1 para inserir uma nova carruagem ou 0 para voltar.");
					
					numero=teclado.nextInt();
					
					if(numero!=0&&numero!=1){
						System.out.println("Apenas pode inserir 0 ou 1");
						numero=2;
					}

				}while(numero==2);

			}while(numero!=0);
			
		}
		public static void menu6() throws Exception {
			int escolha;
			System.out.println("*************************************************");
			System.out.println("\t\tMenu gerir estação/linha");
			System.out.println("*************************************************");
			System.out.println("1. Criar estação");
			System.out.println("2. Alterar estação");
			System.out.println("3. Remover estação");
			System.out.println("4. Criar linha");
			System.out.println("5. Alterar linha");
			System.out.println("6. Remover linha");
			System.out.println("7. Associar estação a uma linha");
			System.out.println("8. Alterar estação de uma linha");
			System.out.println("9. Remover estação de uma linha");
			System.out.println("10. Listar estações");
			System.out.println("11. Listar linhas");
			System.out.println("12. Voltar ao menu anterior");
			System.out.println("*************************************************\n");
			escolha = teclado.nextInt();
			
				switch(escolha) {
				case 1:
					criarestacao();
					break;
				case 2:
					alteestacao();
					break;
				case 3:
					remoestacao();
					break;
				case 4:
					criarlinha();
					break;
				case 5:
					altelinha();
					break;
				case 6:
					remolinha();
					break;
				case 7:
					assoestacaolinha();
					break;
				case 8:
					alteestacaolinha();
					break;
				case 9:
					remoestacaolinha();
					break;
				case 10:
					listarestacoes();
					break;
				case 11:
					listarlinhas();
					break;
				case 12:
					menuprincipal();
					break;

				}
			
		}

		private static void listarlinhas() {
			int sizeoflinhas =dadoslinhas.length;


			for(int i=0; i<sizeoflinhas; i++){

				System.out.println(dadoslinhas[i][0] +" | "+dadoslinhas[i][1]+" | "+dadoslinhas[i][2]);
			}
		}

		private static void listarestacoes() throws Exception  {

			int sizeofestacoes = dadosestacoes.length;


			for(int i=0; i<sizeofestacoes; i++){

				System.out.println(dadosestacoes[i][0] +" | "+dadosestacoes[i][1]+" | "+dadosestacoes[i][2]);
			}
		}

		private static void remoestacaolinha() {
//@TODO Fazer
		}
		private static void alteestacaolinha() {
			//@TODO Fazer
		}
		private static void assoestacaolinha() {
			//@TODO Fazer
			String tmp[][][]= new String[0][4][0];

			for(int i=0; i<dadoslinhas.length; i++)

				for(int j=0; j<dadoslinhas[i].length; j++)

					dadoslinhas[i][j]= String.valueOf(tmp[i][j]);


		}

		private static void remolinha() {
			String linha;
			String tmpArray[][]= new String[dadoslinhas.length-1][3];
			System.out.println("ID     | Cor da Linha | Paragens da Linha");
			for (int i = 0; i<dadoslinhas.length; i++){
				if(dadoslinhas[i][0].compareToIgnoreCase("0")!=0){
					System.out.println(dadoslinhas[i][0]+ "  | " + dadoslinhas[i][1]+ "  | " + dadoslinhas[i][2]);
				}
			}
			System.out.println("Insira o ID da linha que pretende remover");
			linha=teclado.next();
			int i=0;
			for(int j=0;j<dadoslinhas.length;j++){

				if(dadoslinhas[j][0].equalsIgnoreCase(linha)){
					continue;
				}
				tmpArray[i][0]=dadoslinhas[j][0];
				tmpArray[i][1]=dadoslinhas[j][1];
				tmpArray[i][2]=dadoslinhas[j][2];
				i++;	
			}
			dadoslinhas=tmpArray;

		}
		private static void altelinha() {
			String linha;
			String alteracao;
			String alteracao2;
			
				
				System.out.println("ID     | Cor da Linha | Paragens da Linha");
				for (int i = 0; i < dadoslinhas.length; i++){
					if(dadoslinhas[i][0].compareToIgnoreCase("0")!=0)
						System.out.println(dadoslinhas[i][0]+ "  | " + dadoslinhas[i][1]+ "  | " + dadoslinhas[i][2]);
				}	
				System.out.println("Insira o ID da linha que pretende alterar");
				linha=teclado.next();

				for(int h=0; h<dadoslinhas.length; h++){

					if(linha.equals(dadoslinhas[h][0])){

						System.out.println("Insira a nova cor da linha");
						alteracao=teclado.next();

						System.out.println("Insira as novas paragens");
						alteracao2=teclado.next();

						for(int j=0;j<dadoslinhas.length;j++){

							if(dadoslinhas[j][0].equalsIgnoreCase(linha)){

								dadoslinhas[j][1]=alteracao;
								dadoslinhas[j][2]=alteracao2;

							}

						}
					}
				}
		}
		private static void criarlinha() {
			int numero=1;
			do{

				String tmpArray[][] = new String[dadoslinhas.length+1][3];


				for(int i=0; i<dadoslinhas.length;i++) 
				{
					tmpArray[i][0]=dadoslinhas[i][0];
					tmpArray[i][1]=dadoslinhas[i][1];
					tmpArray[i][1]=dadoslinhas[i][3];
				}

				System.out.println("Insira o ID da linha");


				tmpArray[tmpArray.length-1][0]= teclado.next();

				System.out.println("Insira a cor da linha");


				tmpArray[tmpArray.length-1][1]= teclado.next();
				
				System.out.println("Insira as paragens da linha");


				tmpArray[tmpArray.length-1][2]= teclado.next();

				dadoslinhas=tmpArray;

				do{
					System.out.println("Prima 1 para inserir uma nova carruagem ou 0 para voltar.");
					numero=teclado.nextInt();
					if(numero!=0&&numero!=1){
						System.out.println("Apenas pode inserir 0 ou 1");
						numero=2;
					}

				}while(numero==2);

			}while(numero!=0);

		}
		private static void remoestacao() {
			String estacao;
			String tmpArray[][]= new String[dadosestacoes.length-1][3];
			System.out.println("ID     | Nome da Estação | Localização da Estação");
			for (int i = 0; i<dadosestacoes.length; i++){
				if(dadosestacoes[i][0].compareToIgnoreCase("0")!=0){
					System.out.println(dadosestacoes[i][0]+ "  | " + dadosestacoes[i][1]+ "  | " + dadosestacoes[i][2]);
				}
			}
			System.out.println("Insira o ID da estação que pretende remover");
			estacao=teclado.next();
			int i=0;
			for(int j=0;j<dadosestacoes.length;j++){

				if(dadosestacoes[j][0].equalsIgnoreCase(estacao)){
					continue;
				}
				tmpArray[i][0]= dadosestacoes[j][0];
				tmpArray[i][1]=dadosestacoes[j][1];
				tmpArray[i][2]=dadosestacoes[j][2];
				i++;	
			}
			dadosestacoes=tmpArray;

		}
		private static void alteestacao() {
			String estacao;
			String alteracao;
			String alteracao2;
			
				
				System.out.println("ID     | Nome da Estação | Localização da Estação");
				for (int i = 0; i<dadosestacoes.length; i++){
					if(dadosestacoes[i][0].compareToIgnoreCase("0")!=0)
						System.out.println(dadosestacoes[i][0]+ "  | " + dadosestacoes[i][1]+ "  | " + dadosestacoes[i][2]);
				}	
				System.out.println("Insira o ID da estação que pretende alterar");
				estacao=teclado.next();
				for(int h=0;h<dadosestacoes.length;h++){
					if(estacao.equals(dadosestacoes[h][0])){
						System.out.println("Insira o novo nome da estação");
						alteracao=teclado.next();
						System.out.println("Insira a nova localização da estação");
						alteracao2=teclado.next();
						for(int j=0;j<dadosestacoes.length;j++){
							if(dadosestacoes[j][0].equalsIgnoreCase(estacao)){
								dadosestacoes[j][1]=alteracao;
								dadosestacoes[j][2]=alteracao2;

							
						}
					}
				}
					
				}

		}
		private static void criarestacao() {
			int numero=1;
			do{

				String tmpArray[][] = new String[dadosestacoes.length+1][3];


				for(int i=0; i<dadosestacoes.length;i++) 
				{
					tmpArray[i][0]=dadosestacoes[i][0];
					tmpArray[i][1]=dadosestacoes[i][1];
					tmpArray[i][1]=dadosestacoes[i][3];
				}

				System.out.println("Insira o ID da Estação");


				tmpArray[tmpArray.length-1][0]= teclado.next();

				System.out.println("Insira o nome da Estação");


				tmpArray[tmpArray.length-1][1]= teclado.next();
				
				System.out.println("Insira a localização da Estação");


				tmpArray[tmpArray.length-1][2]= teclado.next();

				dadosestacoes=tmpArray;

				do{
					System.out.println("Prima 1 para inserir uma nova carruagem ou 0 para voltar.");
					numero=teclado.nextInt();
					if(numero!=0&&numero!=1){
						System.out.println("Apenas pode inserir 0 ou 1");
						numero=2;
					}

				}while(numero==2);

			}while(numero!=0);

		}
		public static void menu7() throws Exception {
			int escolha;
			System.out.println("*************************************************");
			System.out.println("\t\tMenu gerir movimentos");
			System.out.println("*************************************************");
			System.out.println("1. Colocar composição do metro em circulação");
			System.out.println("2. Remover composição do metro de circulação");
			System.out.println("3. Listar movimentos");
			System.out.println("4. Voltar ao menu anterior");
			System.out.println("*************************************************\n");
			escolha = teclado.nextInt();
				switch(escolha) {
				case 1:
					colocarcomposicao();
					break;
				case 2:
					removercomposicao();
					break;
				case 3:
					listarmovimentos();
					break;
				case 4:
					menuprincipal();
					break;
				}
		}
		private static void listarmovimentos() {
			//@TODO Fazer
		}
		private static void removercomposicao() {
			//@TODO Fazer
		}
		private static void colocarcomposicao() {
			//@TODO Fazer
		}
		public static void menu8() throws Exception {
			int escolha;
			System.out.println("*************************************************");
			System.out.println("\t\tMenu estatística");
			System.out.println("*************************************************");
			System.out.println("1. Listar total de automotoras/carruagens");
			System.out.println("2. Listar total de automotoras/carruagens em circulação");
			System.out.println("3. Listar total de automotoras/carruagens paradas");
			System.out.println("4. Listar composições estacionados com justificação");
			System.out.println("5. Listar total de lugares disponíveis");
			System.out.println("6. Outras");
			System.out.println("7. Voltar ao menu anterior");
			System.out.println("*************************************************\n");
			escolha = teclado.nextInt();
			
				switch(escolha) {
				case 1:
					listartotalautocar();
					break;
				case 2:
					listarautocarcir();
					break;
				case 3:
					listarautocarpar();
					break;
				case 4:
					listarcomposi();
					break;
				case 5:
					listartotallug();
					break;
				case 6:
					outras();
					break;
				case 7:
					menuprincipal();
					break;
				}
		}
		private static void outras() {

		}
		private static void listartotallug() {

		}
		private static void listarcomposi() {

		}
		private static void listarautocarpar() {

		}
		private static void listarautocarcir() {

		}
		private static void listartotalautocar() {

		}
		public static void menusair() throws Exception {
			int escolha;
			System.out.println("*************************************************");
			System.out.println("Deseja sair do programa? 1-Sim 2-NÃ£o");
			System.out.println("*************************************************");
			escolha = teclado.nextInt();
			switch(escolha) {
			case 1:
				System.exit(0);
				break;
			case 2:
				menuprincipal();
				break;

			}

		}
	}

