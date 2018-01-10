
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Projetofinalv {
	static Scanner teclado = new Scanner(System.in);
	static final String[] ficheiros = {"automotora.txt", "carruagens.txt", "linhas.txt", "composicoes.txt", "estaleirocarr.txt","estaleiroauto.txt"};
	static File ficheiro;
	static String dadosautomotora[][]=new String[0][2];
	static String dadoscarruagem[][]= new String[0][2];	
	static String dadoscomposicoes[][]=new String[0][3];
	static String dadoslinhas[][]=new String[0][3];
	static String dadosestacoes[][]=new String[0][3];
	static String dadosestaleirocarr[][]=new String[0][2];
	static String dadosestaleiroauto[][]=new String[0][2];
	static String NomeFicheiro_carruagem = "carruagens.txt";
	static String NomeFicheiro_automotora = "automotora.txt";
	static String NomeFicheiro_estacoes = "estacoes.txt";
	static String NomeFicheiro_linhas = "linhas.txt";
	static String NomeFicheiro_composicoes= "composicoes.txt";
	static String NomeFicheiro_estaleirocarr= "estaleirocarr.txt";
	static String NomeFicheiro_estaleiroauto= "estaleiroauto.txt";

	public static void main(String[] args) throws Exception {


//Inicializa��o dos dados a partir do ficheiro
		dadoscarruagem=lerFicheirocarruagem();
		dadosautomotora=lerFicheiroautomotora();
		dadoscomposicoes=lerFicheiroestacoes();
		dadoslinhas=lerFicheirolinhas();
		dadosestaleirocarr=lerFicheiroestaleirocarr();
		dadosestaleiroauto=lerFicheiroestaleiroauto();
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
	public static void carregararray(String nomeficheiro, String[][] nomearray)
	{
		try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter(nomeficheiro));
			
			for(int i=0; i<nomearray.length; i++)
			{
				for(int y=0; y<nomearray[0].length; y++)
				{
					buffer.write(nomearray[i][y]+";");
				}
				buffer.newLine();
			}
			buffer.close();
		} catch(FileNotFoundException e) {
			System.out.println("Ficheiro n�o encontrado!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erro na aplica��o!");
			e.printStackTrace();
		}
	}

	

	public static String [][] lerFicheirocarruagem(){

		try{
			File ficheiro = new File(NomeFicheiro_carruagem);

			if (!ficheiro.exists()) {
				ficheiro.createNewFile(); 
			}
		}catch(IOException e) {
			System.out.println("Ocorreu um erro durante a cria��o do ficheiro! [DEBUG: "+e.getMessage()+"]");
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
			System.out.println("Ocorreu um erro durante a cria��o do ficheiro! [DEBUG: "+e.getMessage()+"]");
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
			System.out.println("Ocorreu um erro durante a cria��o do ficheiro! [DEBUG: "+e.getMessage()+"]");
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
			System.out.println("Ocorreu um erro durante a cria��o do ficheiro! [DEBUG: "+e.getMessage()+"]");
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
				dadoslinhas[i][2] = String.valueOf((line.split("")[2]));

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
		System.out.println("Ocorreu um erro durante a cria��o do ficheiro! [DEBUG: "+e.getMessage()+"]");
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

		dadoscomposicoes = new String[numLinhas][4];

		for(int i=0; sc1.hasNextLine(); i++)
		{
			String line = sc1.nextLine();
			dadoscomposicoes[i][0] = String.valueOf((line.split(";")[0]));
			dadoscomposicoes[i][1] = String.valueOf((line.split(";")[1]));
			dadoscomposicoes[i][2] = String.valueOf((line.split(";")[2]));
			
			

		}
	} catch (FileNotFoundException e) {
		System.out.println("Ocorreu um erro durante a leitura do ficheiro! [DEBUG: "+e.getMessage()+"]");
	}

	return dadoscomposicoes;
	}
	public static String [][] lerFicheiroestaleirocarr(){

		try{
			File ficheiro = new File(NomeFicheiro_estaleirocarr);

			if (!ficheiro.exists()) {
				ficheiro.createNewFile(); 
			}
		}catch(IOException e) {
			System.out.println("Ocorreu um erro durante a cria��o do ficheiro! [DEBUG: "+e.getMessage()+"]");
			System.out.println("Tente de novo!");
			lerFicheiroestaleirocarr();
		}
		try {
			File file = new File(NomeFicheiro_estaleirocarr);
			Scanner sc1 = new Scanner(file);

			int numLinhas = 0;
			while(sc1.hasNextLine()) {
				numLinhas++;
				sc1.nextLine();
			}
			sc1.close();

			sc1 = new Scanner(file);

			dadosestaleirocarr = new String[numLinhas][2];

			for(int i=0; sc1.hasNextLine(); i++)
			{
				String line = sc1.nextLine();
				dadosestaleirocarr[i][0] = String.valueOf((line.split(";")[0]));
				dadosestaleirocarr[i][1] = String.valueOf((line.split(";")[1]));

			}
			sc1.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ocorreu um erro durante a leitura do ficheiro! [DEBUG: "+e.getMessage()+"]");
		}

		return dadosestaleirocarr;
	}
	public static String [][] lerFicheiroestaleiroauto(){

		try{
			File ficheiro = new File(NomeFicheiro_estaleiroauto);

			if (!ficheiro.exists()) {
				ficheiro.createNewFile(); 
			}
		}catch(IOException e) {
			System.out.println("Ocorreu um erro durante a cria��o do ficheiro! [DEBUG: "+e.getMessage()+"]");
			System.out.println("Tente de novo!");
			lerFicheiroestaleiroauto();
		}
		try {
			File file = new File(NomeFicheiro_estaleiroauto);
			Scanner sc1 = new Scanner(file);

			int numLinhas = 0;
			while(sc1.hasNextLine()) {
				numLinhas++;
				sc1.nextLine();
			}
			sc1.close();

			sc1 = new Scanner(file);

			dadosestaleiroauto = new String[numLinhas][2];

			for(int i=0; sc1.hasNextLine(); i++)
			{
				String line = sc1.nextLine();
				dadosestaleiroauto[i][0] = String.valueOf((line.split(";")[0]));
				dadosestaleiroauto[i][1] = String.valueOf((line.split(";")[1]));

			}
			sc1.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ocorreu um erro durante a leitura do ficheiro! [DEBUG: "+e.getMessage()+"]");
		}

		return dadosestaleiroauto;
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
			System.out.println("Erro na aplica��o!");
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
		System.out.println("4. Gerir Composi��o Do Metro");
		System.out.println("5. Gerir Esta��o/Linha");
		System.out.println("6. Gerir Movimento");
		System.out.println("7. Obter Estat�stica");
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
		System.out.println("1. Listar todas as composi��es do metro");
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
				System.out.println("Valor n�o encontrado...");
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
				System.out.println("Valor n�o encontrado...");
			} else {
				System.out.println("O valor "+valorProcurar+" foi encontrado na posi��o "+indiceElemento);
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
		int sizeofautolivre =dadosestaleiroauto.length;


		for(int i=0; i<sizeofautolivre; i++){

			System.out.println(dadosestaleiroauto[i][0]+"|"+dadosestaleiroauto[i][1]);

		}

	}



	private static void listarcarrlivre() {
		int sizeofcarrlivre =dadosestaleirocarr.length;


		for(int i=0; i<sizeofcarrlivre; i++){

			System.out.println(dadosestaleirocarr[i][0]+"|"+dadosestaleirocarr[i][1]);

		}

		
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
			int sizeofcomposicoes =dadoscomposicoes.length;


			for(int i=0; i<sizeofcomposicoes; i++){

				System.out.println(dadoscomposicoes[i][0]+"|"+dadoscomposicoes[i][1]+"|"+dadoscomposicoes[i][2]);
			}

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

				String arraytemp[][] = new String[dadoscarruagem.length+1][2];

				for(int i=0; i<dadoscarruagem.length;i++) 
				{
					arraytemp[i][0]=dadoscarruagem[i][0];
					arraytemp[i][1]=dadoscarruagem[i][1];
				}

				System.out.println("Insira Carruagem");

				arraytemp[arraytemp.length-1][0]= teclado.next();

				System.out.println("Insira o número de passageiros");

				arraytemp[arraytemp.length-1][1]= teclado.next();

				dadoscarruagem=arraytemp;
				dadosestaleirocarr=arraytemp;
				
				
				

				do{
					System.out.println("Prima 1 para inserir uma nova carruagem ou 0 para voltar.");
					numero=teclado.nextInt();
					if(numero!=0&&numero!=1){
						System.out.println("Apenas pode inserir 0 ou 1");
						numero=2;
					}

				}while(numero==2);
				
			}while(numero!=0);
			carregararray(NomeFicheiro_carruagem,dadoscarruagem);
			carregararray(NomeFicheiro_estaleirocarr,dadosestaleirocarr);
		}



		private static void criarautomotora() {
			int numero=1;
			do{

				String arraytemp[][] = new String[dadosautomotora.length+1][2];

				
				for(int i=0; i<dadosautomotora.length;i++) 
				{
					arraytemp[i][0]=dadosautomotora[i][0];
					arraytemp[i][1]=dadosautomotora[i][1];
				}

				System.out.println("Insira a Automotora");


				arraytemp[arraytemp.length-1][0]= teclado.next();

				System.out.println("Insira o tipo de Automotora");


				arraytemp[arraytemp.length-1][1]= teclado.next();


				dadosautomotora=arraytemp;
				dadosestaleiroauto=arraytemp;

				do{
					System.out.println("Prima 1 para inserir uma nova automotora ou 0 para voltar.");
					numero=teclado.nextInt();
					if(numero!=0&&numero!=1){
						System.out.println("Apenas pode inserir 0 ou 1");
						numero=2;
					}

				}while(numero==2);

			}while(numero!=0);
			carregararray(NomeFicheiro_automotora,dadosautomotora);
			carregararray(NomeFicheiro_estaleiroauto,dadosestaleiroauto);
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
			String arraytemp[][]= new String[dadoscarruagem.length-1][2];



			
			System.out.println("ID	 | N�mero de Passageiros");
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

				arraytemp[i][0]= dadoscarruagem[j][0];
				arraytemp[i][1]= dadoscarruagem[j][1];
				i++;	
			}
			dadoscarruagem=arraytemp;
			carregararray(NomeFicheiro_carruagem,dadoscarruagem);

		}
		private static void removerautomotora() {

			String automotora;
			String arraytemp[][]= new String[dadosautomotora.length-1][2];
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
				arraytemp[i][0]= dadosautomotora[j][0];
				arraytemp[i][1]= dadosautomotora[j][1];
				i++;	
			}
			dadosautomotora=arraytemp;
			carregararray(NomeFicheiro_automotora,dadosautomotora);

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
				carregararray(NomeFicheiro_carruagem,dadoscarruagem);
		}
		private static void alterarautomotora() {
			String automotora;
			String alteracao;
		
				System.out.println("Insira o ID da automotora que pretende alterar");
				System.out.println("ID     | Tipo de Automotora");
				for (int i = 0; i<dadosautomotora.length; i++){
					if(dadosautomotora[i][0].compareToIgnoreCase("0")!=0)
						System.out.println(dadosautomotora[i][0]+ "  | " + dadosautomotora[i][1]);
				}	
				automotora=teclado.next();
				for(int h=0;h<dadosautomotora.length;h++){
					if(automotora.equals(dadosautomotora[h][0])){
						System.out.println("Insira o novo tipo");
						alteracao=teclado.next();
						for(int j=0;j<dadosautomotora.length;j++){
							if(dadosautomotora[j][0].equalsIgnoreCase(automotora)){
								dadosautomotora[j][1]=alteracao;

							}
						}
					}
				}
				carregararray(NomeFicheiro_automotora,dadosautomotora);	
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
			int sizeofcarrestaleiro =dadosestaleirocarr.length;


			for(int i=0; i<sizeofcarrestaleiro; i++){

				System.out.println(dadosestaleirocarr[i][0]+"|"+dadosestaleirocarr[i][1]);

			}

			
		}



		private static void listarautoesta() {
			int sizeofautoestaleiro =dadosestaleiroauto.length;


			for(int i=0; i<sizeofautoestaleiro; i++){

				System.out.println(dadosestaleiroauto[i][0]+"|"+dadosestaleiroauto[i][1]);

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
			String estaleiro;
			String arraytemp[][]= new String[dadosestaleiroauto.length-1][2];



			
			System.out.println("ID	 | Tipo de Automotora");
			for (int i = 0; i<dadosestaleiroauto.length; i++){
				if(dadosestaleiroauto[i][0].compareToIgnoreCase("0")!=0){
					System.out.println(dadosestaleiroauto[i][0]);
				}
			}
			System.out.println("Insira o ID da automotora que pretende remover");
			estaleiro=teclado.next();
			int i=0;

			for(int j=0;j<dadosestaleiroauto.length;j++){
				

				if(dadosestaleiroauto[j][0].equalsIgnoreCase(estaleiro)){
					continue;
				}

				arraytemp[i][0]= dadosestaleiroauto[j][0];
				arraytemp[i][1]= dadosestaleiroauto[j][1];
				i++;	
			}
			dadosestaleiroauto=arraytemp;
			carregararray(NomeFicheiro_estaleiroauto,dadosestaleiroauto);
			
		}



		private static void removercarruagemestaleiro() {
			String estaleiro;
			String arraytemp[][]= new String[dadosestaleirocarr.length-1][2];



			
			System.out.println("ID	 | N�mero de Passageiros");
			for (int i = 0; i<dadosestaleirocarr.length; i++){
				if(dadosestaleirocarr[i][0].compareToIgnoreCase("0")!=0){
					System.out.println(dadosestaleirocarr[i][0]);
				}
			}
			System.out.println("Insira o ID da carruagem que pretende remover");
			estaleiro=teclado.next();
			int i=0;

			for(int j=0;j<dadosestaleirocarr.length;j++){
				

				if(dadosestaleirocarr[j][0].equalsIgnoreCase(estaleiro)){
					continue;
				}

				arraytemp[i][0]= dadosestaleirocarr[j][0];
				arraytemp[i][1]= dadosestaleirocarr[j][1];
				i++;	
			}
			dadosestaleirocarr=arraytemp;

			
			carregararray(NomeFicheiro_estaleirocarr,dadosestaleirocarr);
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
			System.out.println("\t\tMenu gerir composi��es do metro");
			System.out.println("*************************************************");
			System.out.println("1. Criar composi��o do metro");
			System.out.println("2. Associar automotora/carruage");
			System.out.println("3. Alterar composi��o do metro");
			System.out.println("4. Alterar associa��o de uma automotora/carruagem");
			System.out.println("5. Remover composi��o do metro");
			System.out.println("6. Remover associa��o de uma automotora/carruagem");
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
			
		}
		private static void remocompmetro() {
			String composicao;
			String arraytemp[][]= new String[dadoscomposicoes.length-1][3];
			System.out.println("ID  | Automotora | Carruagem");
			for (int i = 0; i<dadoscomposicoes.length; i++){
				if(dadoscomposicoes[i][0].compareToIgnoreCase("0")!=0){
					System.out.println(dadoscomposicoes[i][0]+ "  | " + dadoscomposicoes[i][1]+ "  | " + dadoscomposicoes[i][2]);
				}
			}
			System.out.println("Insira o ID da composi��o que pretende remover");
			composicao=teclado.next();
			int i=0;
			for(int j=0;j<dadoscomposicoes.length;j++){

				if(dadoscomposicoes[j][0].equalsIgnoreCase(composicao)){
					continue;
				}
				arraytemp[i][0]=dadoscomposicoes[j][0];
				arraytemp[i][1]=dadoscomposicoes[j][1];
				arraytemp[i][2]=dadoscomposicoes[j][2];
				i++;	
			}
			dadoscomposicoes=arraytemp;
			carregararray(NomeFicheiro_composicoes,dadoscomposicoes);

		}
		
		private static void alteassoautocarru() {
			
			
		}
		private static void altecompmetro() {
			String composicao;
			String alteracao;
			String alteracao2;
			
				
				System.out.println("ID  | Automotora | Carruagem");
				for (int i = 0; i<dadoscomposicoes.length; i++){
					if(dadoscomposicoes[i][0].compareToIgnoreCase("0")!=0)
						System.out.println(dadoscomposicoes[i][0]+ "  | " + dadoscomposicoes[i][1]+ "  | " + dadoscomposicoes[i][2]);
				}	
				System.out.println("Insira o ID da composi�ao que pretende alterar");
				composicao=teclado.next();
				for(int h=0;h<dadoscomposicoes.length;h++){
					if(composicao.equals(dadoscomposicoes[h][0])){
						System.out.println("Insira uma nova automotora a composi��o");
						alteracao=teclado.next();
						System.out.println("Insira uma nova carruagem a composi��o");
						alteracao2=teclado.next();
						for(int j=0;j<dadoscomposicoes.length;j++){
							if(dadoscomposicoes[j][0].equalsIgnoreCase(composicao)){
								dadoscomposicoes[j][1]=alteracao;
								dadoscomposicoes[j][2]=alteracao2;

							
						}
					}
				}
					
					
				}
			
				carregararray(NomeFicheiro_composicoes,dadoscomposicoes);
		}
		private static void associarautocarru() {
			
			String arraytemp[][] = new String[dadoscomposicoes.length+1][4];
			for(int i=0; i<dadoscomposicoes.length; i++) 
			{
				System.out.println(dadoscomposicoes[i][0]);
			}
			
			System.out.println("Insira a Composi��o");
			arraytemp[arraytemp.length-1][0]= teclado.next();
			
			System.out.println("Insira apenas uma Automotora");

			arraytemp[arraytemp.length-1][1]= teclado.next();
			
			System.out.println("Insira apenas uma Carruagem");
			
			
			arraytemp[arraytemp.length-1][2]= teclado.next();
			
			dadoscomposicoes=arraytemp;
			carregararray(NomeFicheiro_composicoes,dadoscomposicoes);
			
		}
		


		private static void criarcompmetro() {
			

				String arraytemp[][] = new String[dadoscomposicoes.length+1][3];

				for(int i=0; i < dadoscomposicoes.length ;i++) 
				{
					arraytemp[i] = dadoscomposicoes[i];
				
				}

				System.out.println("Insira o ID da Composi��o");

				arraytemp[arraytemp.length-1][0]= teclado.next();
				
				
				dadoscomposicoes=arraytemp;
				
			

				
				carregararray(NomeFicheiro_composicoes,dadoscomposicoes);
		
		}
		

		public static void menu6() throws Exception {
			int escolha;
			System.out.println("*************************************************");
			System.out.println("\t\tMenu gerir esta��o/linha");
			System.out.println("*************************************************");
			System.out.println("1. Criar esta��o");
			System.out.println("2. Alterar esta��o");
			System.out.println("3. Remover esta��o");
			System.out.println("4. Criar linha");
			System.out.println("5. Alterar linha");
			System.out.println("6. Remover linha");
			System.out.println("7. Associar esta��o a uma linha");
			System.out.println("8. Alterar esta��o de uma linha");
			System.out.println("9. Remover esta��o de uma linha");
			System.out.println("10. Listar esta��es");
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

			int sizeofestacoes = dadoscomposicoes.length;


			for(int i=0; i<sizeofestacoes; i++){

				System.out.println(dadoscomposicoes[i][0] +" | "+dadoscomposicoes[i][1]+" | "+dadoscomposicoes[i][2]);
			}
		}

		private static void remoestacaolinha() {
		
		}



		private static void alteestacaolinha() {
			String linha;
			String alteracao;
			
				
				System.out.println("ID | Cor da Linha | Esta��o");
				for (int i = 0; i < dadoslinhas.length; i++){
					if(dadoslinhas[i][0].compareToIgnoreCase("0")!=0)
						System.out.println(dadoslinhas[i][0]+ "  | " + dadoslinhas[i][1]+ "  | " + dadoslinhas[i][2]);
				}	
				
				System.out.println("Insira o ID da linha que pretende alterar");
				linha=teclado.next();

				for(int h=0; h<dadoslinhas.length; h++){

					if(linha.equals(dadoslinhas[h][0])){

						System.out.println("Insira a nova esta��o");
						alteracao=teclado.next();

						for(int j=0;j<dadoslinhas.length;j++){

							if(dadoslinhas[j][0].equalsIgnoreCase(linha)){

								dadoslinhas[j][2]=alteracao;

							}

						}
					}
				}
				carregararray(NomeFicheiro_linhas,dadoslinhas);
		}
		private static void assoestacaolinha() {
			  System.out.println("ID     | Cor da Linha");
		        for (int i = 0; i<dadoslinhas.length; i++){
		            if(dadoslinhas[i][0].compareToIgnoreCase("0")!=0){
		                System.out.println(dadoslinhas[i][0]+ "  | " + dadoslinhas[i][1]);
		            }
		        }
		        System.out.println("\nEsta��es");
		        for(int i=0; i<dadoscomposicoes.length; i++)
		        {
		            System.out.println(dadoscomposicoes[i][0]);
		        }

		        System.out.println("\nQual a esta��o que prentende adicionar");
		        String estacao= teclado.next();

		        System.out.println("Qual � a linha a que pretende adicionar");
		        String linha = teclado.next();

		        for (int i=0; i<dadoslinhas.length; i++)
		        {
		            if(dadoslinhas[i][0].equalsIgnoreCase(linha))
		            {
		                dadoslinhas[i][2]= estacao;

		            }
		        }


		        carregararray(NomeFicheiro_linhas,dadoslinhas);
		}

		private static void remolinha() {
			String linha;
			String arraytemp[][]= new String[dadoslinhas.length-1][3];
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
				arraytemp[i][0]=dadoslinhas[j][0];
				arraytemp[i][1]=dadoslinhas[j][1];
				arraytemp[i][2]=dadoslinhas[j][2];
				i++;	
			}
			dadoslinhas=arraytemp;
			carregararray(NomeFicheiro_linhas,dadoslinhas);
		}
		private static void altelinha() {
			String linha;
			String alteracao;
			
				
				System.out.println("ID     | Cor da Linha | Paragens da Linha");
				for (int i = 0; i < dadoslinhas.length; i++){
					if(dadoslinhas[i][0].compareToIgnoreCase("0")!=0)
						System.out.println(dadoslinhas[i][0]+ "  | " + dadoslinhas[i][1]);
				}	
				System.out.println("Insira o ID da linha que pretende alterar");
				linha=teclado.next();

				for(int h=0; h<dadoslinhas.length; h++){

					if(linha.equals(dadoslinhas[h][0])){

						System.out.println("Insira a nova cor da linha");
						alteracao=teclado.next();

						for(int j=0;j<dadoslinhas.length;j++){

							if(dadoslinhas[j][0].equalsIgnoreCase(linha)){

								dadoslinhas[j][1]=alteracao;

							}

						}
					}
				}
				carregararray(NomeFicheiro_linhas,dadoslinhas);
		}
		private static void criarlinha() {
			int numero=1;
			do{

				String arraytemp[][] = new String[dadoslinhas.length+1][3];


				for(int i=0; i<dadoslinhas.length;i++) 
				{
					arraytemp[i][0]=dadoslinhas[i][0];
					arraytemp[i][1]=dadoslinhas[i][1];
				}

				System.out.println("Insira o ID da linha");


				arraytemp[arraytemp.length-1][0]= teclado.next();

				System.out.println("Insira a cor da linha");


				arraytemp[arraytemp.length-1][1]= teclado.next();

				dadoslinhas=arraytemp;

				do{
					System.out.println("Prima 1 para inserir uma nova linha ou 0 para voltar.");
					numero=teclado.nextInt();
					if(numero!=0&&numero!=1){
						System.out.println("Apenas pode inserir 0 ou 1");
						numero=2;
					}

				}while(numero==2);

			}while(numero!=0);
			carregararray(NomeFicheiro_linhas,dadoslinhas);
		}
		private static void remoestacao() {
			String estacao;
			String arraytemp[][]= new String[dadosestacoes.length-1][3];
			System.out.println("ID     | Nome da Esta��o | Localiza��o da Esta��o");
			for (int i = 0; i<dadosestacoes.length; i++){
				if(dadosestacoes[i][0].compareToIgnoreCase("0")!=0){
					System.out.println(dadosestacoes[i][0]+ "  | " + dadosestacoes[i][1]+ "  | " + dadosestacoes[i][2]);
				}
			}
			System.out.println("Insira o ID da esta��o que pretende remover");
			estacao=teclado.next();
			int i=0;
			for(int j=0;j<dadosestacoes.length;j++){

				if(dadosestacoes[j][0].equalsIgnoreCase(estacao)){
					continue;
				}
				arraytemp[i][0]= dadosestacoes[j][0];
				arraytemp[i][1]=dadosestacoes[j][1];
				arraytemp[i][2]=dadosestacoes[j][2];
				i++;	
			}
			dadosestacoes=arraytemp;
			carregararray(NomeFicheiro_estacoes,dadosestacoes);
		}
		private static void alteestacao() {
			String estacao;
			String alteracao;
			String alteracao2;
			
				
				System.out.println("ID     | Nome da Esta��o | Localiza��o da Esta��o");
				for (int i = 0; i<dadosestacoes.length; i++){
					if(dadosestacoes[i][0].compareToIgnoreCase("0")!=0)
						System.out.println(dadosestacoes[i][0]+ "  | " + dadosestacoes[i][1]+ "  | " + dadosestacoes[i][2]);
				}	
				System.out.println("Insira o ID da estação que pretende alterar");
				estacao=teclado.next();
				for(int h=0;h<dadosestacoes.length;h++){
					if(estacao.equals(dadosestacoes[h][0])){
						System.out.println("Insira o novo nome da esta��o");
						alteracao=teclado.next();
						System.out.println("Insira a nova localiza��o da esta��o");
						alteracao2=teclado.next();
						for(int j=0;j<dadosestacoes.length;j++){
							if(dadosestacoes[j][0].equalsIgnoreCase(estacao)){
								dadosestacoes[j][1]=alteracao;
								dadosestacoes[j][2]=alteracao2;

							
						}
					}
				}
					
				}
				carregararray(NomeFicheiro_estacoes,dadosestacoes);

		}
		private static void criarestacao() {
			int numero=1;
			do{

				String arraytemp[][] = new String[dadosestacoes.length+1][3];


				for(int i=0; i<dadosestacoes.length;i++) 
				{
					arraytemp[i][0]=dadosestacoes[i][0];
					arraytemp[i][1]=dadosestacoes[i][1];
				}

				System.out.println("Insira o ID da Esta��o");


				arraytemp[arraytemp.length-1][0]= teclado.next();

				System.out.println("Insira o nome da Esta��o");


				arraytemp[arraytemp.length-1][1]= teclado.next();
				

				dadosestacoes=arraytemp;

				do{
					System.out.println("Prima 1 para inserir uma nova carruagem ou 0 para voltar.");
					numero=teclado.nextInt();
					if(numero!=0&&numero!=1){
						System.out.println("Apenas pode inserir 0 ou 1");
						numero=2;
					}

				}while(numero==2);

			}while(numero!=0);
			carregararray(NomeFicheiro_estacoes,dadosestacoes);

		}
		public static void menu7() throws Exception {
			int escolha;
			System.out.println("*************************************************");
			System.out.println("\t\tMenu gerir movimentos");
			System.out.println("*************************************************");
			System.out.println("1. Colocar composi��o do metro em circula��o");
			System.out.println("2. Remover composi��o do metro de circula��o");
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
			
		}
		private static void removercomposicao() {
			
		}
		private static void colocarcomposicao() {
		
		}
		public static void menu8() throws Exception {
			int escolha;
			System.out.println("*************************************************");
			System.out.println("\t\tMenu estat�stica");
			System.out.println("*************************************************");
			System.out.println("1. Listar total de automotoras/carruagens");
			System.out.println("2. Listar total de automotoras/carruagens em circula��o");
			System.out.println("3. Listar total de automotoras/carruagens paradas");
			System.out.println("4. Listar composi�es estacionados com justifica��o");
			System.out.println("5. Listar total de lugares dispon�veis");
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
			System.out.println("Deseja sair do programa? 1-Sim 2-N�o");
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

