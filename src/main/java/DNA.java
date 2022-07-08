
/**
 * クラス DNA の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class DNA {
    public String str="";
    
    public String getPair(){
        String pairStr="";
        String pairCh="";
        for( int i=0; i < this.str.length(); i++) {
            if (str.charAt(i) == 'T') pairCh="T";
            else if(str.charAt(i)=='A') pairCh="A";
            else if (str.charAt(i)=='G') pairCh="C";
            else if(str.charAt(i)=='C') pairCh="G";
            pairStr+=pairCh;
        }
     
        return pairStr;
    }
}

