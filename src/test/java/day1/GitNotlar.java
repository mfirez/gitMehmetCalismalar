package day1;

public class GitNotlar {
    /**
     * projemizi git e yüklemek icin "git init" yaziyoruz terminal kismina
     * otomatik gizli bir klasör olusturuyor projemizin kayitli oldugu yerde
     * .gitignore file i olusturuyouz --> ana proje-new-feil-.gitignore
     * git add dosyauzantisi(tab tusu ile otomatikde yaziyor)---> git e bu classi takip et demis olduk
     * git status --> add diyip kanca taktiklarimiz mavi renkte eklenmeyenler kirmizi renkte görünür
     * herhangi bir degisiklik yaptigimiz dosyalar (modified) kirmizi olur hemen
     * git add . ---> kirmizi olan bütün class lari dosyalari ekler. gitignore eklediklerimiz haric
     * git commit -m"All Project Files Uploaded(yazmak istediginiz mesaj)" ---> dosyamizi kaydetmis oluruz
     *
     * GIT BASE KOMUT OZETI
     *
     * ->git init -- ilk kez projemize GIT i tanimlamak icin kullanilir, tek seferlik calistirilir.
     * .gitignore   -->  ozel bir file dir. git in track sistemine dahil etmek istemediginiz dosya ve/veya  klasorler bu file icin de satir satir tutulur.
     * Sadece LOCAL de calisma yapacak iseniz alttaki mail ve isim degerleri eklenmeli!!!
     * git config --global user.email "you@example.com"
     * git config --global user.name "Your Name"
     * ->git add dosyaIsmi.uzantisi  -- untrackt file lara kancayi takmak icin / tracked yapmak icin kullanilir
     * ->git add . -- butun untracked dosylari EKLEMEK icin / yani tracked yapmak icin kullanilir!
     * ->git commit -m"commit mesaji yaz"  -- eklenen ve tracked olan dosyalari KAYDETMEK ICIN (Snapshot!!)
     *                                            peki nereye -> Local git directory e! LOCAL REPO!
     * ->git status -- untracked , tracked ve modifed dosyalari bize getirir gosterir
     * ->git log -- commit gecmisini gosterir
     * ->git push -- localdeki degisikleri remote repoya gonderir !!
     * ->git pull -- remotedaki degisiklikleri local repo alir!!
     * ->git branch -- mevcut branchlari listeler
     * ->git branch aaa  -- aaa adinda yeni branch olusturur ve bu branch main branch in 1 e 1 clone u olur!!
     * ->git checkout aaa  --  aaa branch ina gecis yapar!!
     *  2.40   bbb
     */
}
