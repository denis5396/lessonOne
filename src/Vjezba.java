import java.util.Scanner;
import java.util.Locale;
/*public class Vjezba {
    static final int brojEl = 10;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int niz[] = new int [brojEl];
        int suma;
        int sumaEp = 0;
        int brojEp = 0;
        int max = niz[0];
        int min = niz[0];
        double prosjekp;
        double prosjek;
        suma = 0;
        sumaEp = 0;
        for(int i=0; i < brojEl; i++) {
            System.out.print("Unesite " + (i + 1) + ". cijeli broj: ");
            niz[i] = input.nextInt();

            if (i == 0){
                max = niz[0];
                min = niz[0];
            }
            else if (niz[i] > max) {
                max = niz[i];
            }
            else if (niz[i] < min){
                min = niz[i];
            }
            else if (niz[i] % 2 == 0) {
                sumaEp += niz[i];
                brojEp += 1;


            }suma += niz[i];

        }prosjek = (double)suma/brojEl;
         prosjekp = (double)sumaEp/brojEp;
        System.out.println("Srednja vrijednost unesenih brojeva je: " + prosjek);
        System.out.println("Srednja vrijednost unesenih parnih brojeva je: " + prosjekp);
        System.out.print("Najveci element je " + max + " , a najmanji " + min + " .");
    }
}

class Vjezba {
    static final int brojEl = 5;

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[brojEl];
        int b[] = new int[brojEl];
        int c[] = new int[brojEl];
        double ad = a[0];
        System.out.print("Unesite clanove niza A: ");
        for (int i = 0; i < brojEl; i++) {

                System.out.print("");
                a[i] = input.nextInt();


        }System.out.print("Unesite clanove niza B: ");
        for (int i = 0; i < brojEl; i++) {
            System.out.print("");
            b[i] = input.nextInt();

        }
        System.out.print("Niz A glasi: ");
        for (int i = 0; i < brojEl; i++) {
            ad = a[i];
            System.out.print(ad + " ");
        }
        System.out.print("\nNiz B glasi: ");
        for (int i = 0; i < brojEl; i++){
            ad = a[i];
            System.out.print(ad + " ");
        }
        System.out.print("\nNiz C glasi: ");
        for (int i = 0; i < brojEl; i++){
            c[i] = 2 * a[i] + b[i];
            ad = c[i];
            System.out.print(ad + " ");
        }
    }
}

class Vjezba {

    static final int n = 100;

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        int niz[] = new int[n];
        int i = 0;
        int unos;
        int suma = 0;
        int suma1 = 0;
        int suma2 = 0;
        System.out.println("Unesite brojeve: ");
        do {

            unos = input.nextInt();
            if (unos != -1) {
                niz[i] = unos;




                if (niz[i] % 5 == 0) {
                    suma += 1;
                }if (niz[i] % 7 == 0) {
                    suma1 += 1;
                }if (niz[i] % 11 == 0) {
                    suma2 += 1;
                }
                i++;

            }
        }while (unos != -1);
        System.out.println("Djeljivih sa 5: " + suma);
        System.out.println("Djeljivih sa 7: " + suma1);
        System.out.println("Djeljivih sa 11: " + suma2);
        }
}

class Vjezba {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Unesite n: ");
        n = input.nextInt();
        int proizvod = 1;
        if (n > 0){
            for (int i = 0; i <= n; i++){
                if (i % 2 == 0 && i != 0){
                    proizvod *= i;
                }
            }
            System.out.print("Proizvod je: " + proizvod);
        }
        else{
            System.out.print("Uneseni broj nije prirodan!");
        }

    }

}
class Vjezba {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Unesite n: ");
        n = input.nextInt();
        int suma = 0;
        if (n > 0) {
            for (int i = 0; i <= n; i++) {

                    suma += (i * i);

            }
            System.out.print("Suma je: " + suma);
        } else {
            System.out.print("Uneseni broj nije prirodan!");

        }
    }
}

class Vjezba {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int n;
        int suma = 0;
        System.out.print("Unesite n: ");
        n = input.nextInt();

        if (n > 2 && n < 10) {
            for (int i = 1; i <= n; i++){
                for (int j = 1; j <= n; j++){
                    System.out.print(j * (i) + " ");

                }
                System.out.println("");
            }

        } else {
            System.out.print("Uneseni broj nije u intervalue [2,10]!");

        }
    }
}

class Vjezba {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int n;
        int suma = 0;
        System.out.print("Unesite n: ");
        n = input.nextInt();

        for (int i = 1; i <= n/2; i++){
            if (n % i == 0){
                System.out.println(i);
            }
        }
    }
}

class Vjezba
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;
        int suma = 0;
        System.out.print("Unesite n: ");
        n = input.nextInt();
        boolean prost;
        for (int i = 2; i <= n; i++)
        {
            prost = true;

            for(int num = 2; num < i; num++)
            {
                if(i % num == 0)
                {
                    System.out.print(num);
                    prost = false;
                    break;

                }
            }
            if (prost == true)
            {
                suma += i;
                System.out.println(i);
            }
            if(i == n) break;

        }
        System.out.println("Suma je: " + suma);

    }
}


class Vjezba {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite bazu: ");
        float n = input.nextFloat();
        System.out.print("Unesite eksponent: ");
        float exp = input.nextFloat();
        float sum = 1;

        if(exp % 1 == 0 && exp >= 1) {
            for(int i = 0; i < exp; i++)
                sum *=  n ;
                System.out.print(n +"^" + (int)exp + " = " + sum);
        }
        else if(exp < 1){
            System.out.print("Uneseni broj nije prirodan!");
        }
        else
            System.out.print("Uneseni broj nije cjelobrojan!");

        }
}
import java.util.InputMismatchException;
class Vjezba {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite bazu: ");
        float n = input.nextFloat();
        int exp = 0;
        float sum = 1;

            try {
                System.out.print("Unesite eksponent: ");
                exp = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Uneseni broj nije cjelobrojan!");
                input.reset();
            }


        if(exp >= 1) {
            for(int i = 0; i < exp; i++)
                sum *=  n ;
            System.out.print(n +"^" + exp + " = " + sum);
        }

    }
}

class Vjezba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean kraj;
        do{
            kraj = false;
            System.out.print("Unesite n: ");
            int n = input.nextInt();
            if (n < 1)
                System.out.println("Broj " + n + " nije prirodan!");
            if(n >=1)
                kraj = true;
                for (int i = 1; i <= n; i++){
                    if (i % 2 != 0 && i % 3 != 0 && i % 13 != 0){
                        System.out.println(i);
                    }

                }

        }while(!kraj);

    }
}

class Vjezba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.print("Unesite n: ");
            int n = input.nextInt();

            for (int j = 0; j < n; j++){
                if (n < 1)
                    return;
                for (int i = 1; i <= n; i++) {
                    if (i % 2 != 0 && i % 3 != 0 && i % 13 != 0) {
                        System.out.println(i);
                    }
                }
            }
    }
}


class Vjezba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        int br1 = 0;
        int br2 = 1;
        System.out.print("Unesite n: ");
        int n = input.nextInt();
        do{
            if(br1 != 0)
            System.out.print(br1 + " ");
            sum = br1 + br2;
            br1 = br2;
            br2 = sum;
            i++;
        }while(i <= n);
    }
}
class Vjezba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite n: ");
        int n = input.nextInt();
        System.out.print("Unesite sirinu ispisa: ");
        int r = input.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){

                if (j == i) {
                    System.out.print(1);
                }
                else if (j != i){
                    System.out.print(0);
                }
                for(int k = 0; k < r; k++){
                    System.out.print(" ");
                }
            }
        }
    }
}

class Vjezba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean kraj;
        int br = 0;
        int br1 = 0;
        int razlika = 0;
        int i = 0;
        System.out.println("Unesite n: ");
        do{
            kraj = false;
            int n = input.nextInt();
            br = n;
            if(n != br)
            System.out.print(br + "" + br1);
                i++;
                //System.out.print(i + " zadovoljava uslov.");
            if(n == 0){
                kraj = true;
            }
        }while(!kraj);
    }
}

class Vjezba {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] num = new int[100];
        int [] count = new int[1000];
        int priv ;
        System.out.println("Unesite brojeve: ");


        for(int i=0; i < num.length; i++){
            num[i] = input.nextInt();
            if(num[i] < 0 || num[i] > 100 ) {
                if (num[i] != -1)
                    System.out.println("Brojevi moraju biti izmedju 0 i 100!");


                if (num[i] == -1) {
                    break;
                }
                i--;
            }
        }
        for(int i = 0; i < num.length; i++){
            count[num[i]++;
        }

        for(int i=1; i < count.length; i++){

            if(count[i] > -1 && count[i] == 1){
                System.out.println("Broj " + i + " se javlja jednom.");
            }
            else if(count[i] >=2){
                System.out.println("Broj " + i + " se javlja " + count[i] + " puta.");
            }


        }

    }
}

class Vjezba{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int br = 0 ;
        int br1 = 0;
        int cur = 0;
        int count = 0;

        int i = 0;
        System.out.println("Unesite brojeve (0 za kraj):");
        do{
              cur = input.nextInt();
              i++;
              if (i >= 3){
                  if(br1 == Math.abs(br-cur))
                      count++;
            }
            br = br1;
            br1 = cur;
        }while(cur != -1);
        System.out.print(count + " broja zadovoljava uslov.");
    }
}

class Vjezba {
    static final int n = 100;
    public static int vratiVrijednost(int a){
        Scanner input = new Scanner(System.in);
        int unos;
        int i = 0;
        int niz[] = new int[n];
        System.out.print("Unesite brojeve: ");
        do{
            unos = input.nextInt();
            if(unos != -1)
            niz[i] = unos;
            for(int j = 0; j < niz[i]; j++)
            i++;

        }while(unos != -1);
        return a;
    }
    public static void main(String[]args){
        vratiVrijednost(2);
        System.out.print("Nakon preslaganja niz glasi: ");
    }
}

*//*
class Vjezba {
    static boolean jeLiSlovo(char c) {
        if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') return true;
        else return false;
    }

    static String izbrojiRijeci(String tekst) {
        int i = 0;
        String najmanja = "";
        String currentRijec = "";

        while (i < tekst.length()) {
            currentRijec = "";
            while (i < tekst.length() && jeLiSlovo(tekst.charAt(i))) {
                currentRijec += tekst.charAt(i);
                i++;
            } //preskace slova(rijeci)
            if (najmanja == "") najmanja = currentRijec;
            else if (currentRijec.length() < najmanja.length()) najmanja = currentRijec;


            while (i < tekst.length() && !jeLiSlovo(tekst.charAt(i)))
                i++; //preskace neslova
        }
        return najmanja;
    }
    public static void main(String[]args){
        System.out.println(izbrojiRijeci("dsa ad dsdsa wedds"));
    }
}

*//*
class Vjezba{
    static void checkAge(int age){
        if (age < 18){
            System.out.println("Access denied.");
        }
        else
            System.out.println("Access granted.");
    }
    public static void main(String[]args){
        checkAge(20);
    }
}

class Vjezba{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite vase ime: ");
        String ime = input.nextLine();
        Internet laptop = new Internet();
        laptop.spojen(ime);
        System.out.println(laptop.proracun(13, 25));
    }
}
*//*
class Vjezba {
    static boolean jesuLiJednaki(double a, double b) {
        return Math.abs(a - b) < 0.00001;
    }

    static boolean usporediCifre(int a) {
        Scanner input = new Scanner(System.in);
        int proslaCifra = 0;
        int trenutnaCifra = 0;
        int broj = input.nextInt();
        broj /= 10;
        System.out.println(broj);


        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int proslaCifra = 0;
        int trenutnaCifra = 0;
        int broj = input.nextInt();
        while (broj != 0) {
            trenutnaCifra = broj % 10;
            System.out.print(trenutnaCifra);
            broj /= 10;
            proslaCifra = broj % 10;
            if(proslaCifra != trenutnaCifra){
                break;
            }
        }
    }
}
*//*
class Vjezba {
    static boolean usporediCifre(int a) {
        int proslaCifra = -1;
        int trenutnaCifra = 0;
        while (a != 0) {
            trenutnaCifra = a % 10;
            if(proslaCifra != -1){
                if(trenutnaCifra != proslaCifra) return false;

            }else{
                proslaCifra = trenutnaCifra;
            }
            a /= 10;
        }

        return true;
    }

    static int[] sortirajNiz(int niz[]){
        int indeks;
        int temp;
        for(int i=0; i<niz.length; i++){
            if(!usporediCifre(niz[i])){
                //broj kod kojeg nisu iste cifre
                indeks = -1;
                for(int j=i+1; j<niz.length; j++){
                    if(usporediCifre(niz[j])){
                        indeks = j;
                        break;
                    }
                }
                if(indeks != -1){
                    temp = niz[indeks];
                    for(int j =indeks; j>i; j--){
                        niz[j] = niz[j-1];
                    }
                    niz[i] = temp;
                }
            }
        }
        return niz;
    }

    static void ispisiNiz(int niz[]){
        for(int i=0; i<niz.length;i++) {
            System.out.print(niz[i]);
            if(i != niz.length-1) System.out.print(" ");
        }
        System.out.println("");
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int nizx[] = new int[100];
        int brEl = 0;
        int unos;
        do{
            System.out.print("Unesite brojeve (-1 za kraj): ");
            unos = input.nextInt();
            if(unos != -1){
                nizx[brEl] = unos;
                brEl++;
            }
        }while(unos != -1);

        int niz[] = new int[brEl];

        for(int i = 0; i<brEl;i++)
            niz[i] = nizx[i];

        System.out.print("Originalni niz: ");
        ispisiNiz(niz);
        niz = sortirajNiz(niz);
        System.out.print("Valjda sortirani niz: ");
        ispisiNiz(niz);

    }
}
*/
class Vjezba{
    static double[][] unesiMatricu(int m, int n){
        Scanner input = new Scanner(System.in);
        double [][] matrica = new double[m][n];
        System.out.println("Unesite elemente matrice: ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrica[i][j] = input.nextDouble();
            }
        }
        return matrica;
    }

    static void ispisiMatricu(double matrica[][]) {
        System.out.println("Matrica je: ");
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++)
                System.out.print(matrica[i][j] + "  ");
            System.out.println("");
        }
    }
    static double srednjaVrijednost(double[][] matrica){
        double suma = 0;
        for(int i = 0; i < matrica.length; i++){
            for(int j = 0; j < matrica[i].length; j++)
                suma += matrica[i][j];
        }
        return suma/(matrica.length * matrica[0].length);
    }
    static double dajProsjekReda(double[][] matrica, int indeksReda){
        double suma = 0;

        double[] red;
        for(int i = 0; i < matrica[indeksReda].length;i++){
            suma += matrica[indeksReda][i];
        }
        return suma/(matrica[indeksReda].length);
    }
    static double[][] izbaciRedove(double[][] matrica, double kriticniProsjek){
        int velicina = matrica.length;
        int brKolona = matrica[0].length;
        for(int i = 0; i < velicina; i++){
            if(dajProsjekReda(matrica, i) < kriticniProsjek){
                for(int j = i; j<velicina-1; j++)
                    matrica[j] = matrica[j+1];
                velicina--;
                i--;
            }
        }
        double[][] novaMatrica = new double[velicina][brKolona];
        for(int i=0; i<velicina; i++)
            for(int j=0; j<brKolona; j++)
                novaMatrica[i][j] = matrica[i][j];
        return novaMatrica;
    }
    public static void main(String[]args){
        int m,n;
        double [][] matrica;
        Scanner input = new Scanner(System.in);
        matrica = unesiMatricu(3, 3);
        ispisiMatricu(matrica);
        izbaciRedove(matrica, srednjaVrijednost(matrica));

        matrica = unesiMatricu(2,2);
        ispisiMatricu(matrica);
    }
}

