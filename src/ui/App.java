package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
	private BufferedReader br;
	
	
	public App(){
        br = new BufferedReader(new InputStreamReader(System.in));
    }
	
	
	public void start() throws IOException, InterruptedException{
        logoMenu();
        startMenu();
        //ConstructApp();
        //mostrarResultado();
    }
	
	private void logoMenu(){
        Menu m = new Menu("   =============================================\n"
        +                 "   ====        Seguimiento BFS - DFS        ====\n"
        +                 "   =============================================\n"
        +                 "\n");
        m.showMenu();
    }
	private void startMenu() throws IOException{
        Menu m = new Menu("   Segumiento BFS - DFS es una app que nos permitira\n"
        +                 "   verificar si un grafo dirigido es fuertemente conexo o no");
        m.showMenu();
        
        String b = br.readLine();
        int n = Integer.parseInt(b);
        System.out.println("|===================================================");
    }
}
