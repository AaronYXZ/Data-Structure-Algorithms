package hw1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TrieDictionary {
	public class Node{
		Node[] nextL;
		boolean isword;
		public Node(){
			this.nextL=null;
			this.isword = false;
		}
	}
	Node root;
	
	public void add(String s){
		if(root==null){
			root = new Node();
		}
		Node p = root;
		for(int i=0;i<s.length();i++){
			int index = s.charAt(i)-97;
			if(p.nextL==null){
				p.nextL = new Node[26];
			}
			if(p.nextL[index]==null){
				p.nextL[index]=new Node();

			}
			p=p.nextL[index];
		}
		p.isword=true;
	}
	public boolean serach(String s){
		Node p =root;
		
		for(int i =0;i<s.length();i++){
			int index = s.charAt(i)-97;
			if(p.nextL[index]==null){

				return false;
			}else{
				p = p.nextL[index];
			}
		}
		if(p.isword){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/dict.txt"));
		TrieDictionary tp = new TrieDictionary();
		String s;
		while((s = br.readLine())!=null){
			s.toLowerCase();
			
			tp.add(s);
		}
		BufferedReader br2 = new BufferedReader(new FileReader("src/hw5.txt"));
		while((s=br2.readLine())!=null){
			s.toLowerCase();
			System.out.println(s+":"+tp.serach(s));
		}

	}
}
