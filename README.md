# DontStraveLite

 
1. feladat - Don’t Starve lite
A feladat leírása
A feladat a Don’t Starve játék leegyszerűsített változatának elkészítése Java nyelven. A játék lényege, hogy minél tovább maradjunk életben karakterünkkel. A játék egy kellően nagy (legalább 100x100-as) területen játszódik. A mezőkön alapvetően vagy szárazföld, vagy víz van. A víz lehet például a pálya szélén, de akár a közepén is, de ebben az esetben legalább 20 egybefüggő területből álljon. A karakterünkkel nem tudunk belemenni a vízbe, illetve a pályáról sem tudunk kimenni. Karakterünknek 3 fő “szükséglete” van:
• Élet (HP): a karakterünk életereje (0-100 közötti valós szám, ha elérjük a 0-t, a játék véget ér)
• Éhség: mennyire éhes a karakterünk (0-100 közötti valós szám, a 0 jelenti azt, hogy éhen halt, a 100 pedig hogy teljesen tele van; ha elérjük a 0-t, a játék véget ért)
• Agy: ebben az ijesztő világban karakterünk könnyen megőrülhet, ez a 0 elérésekor következik be, a maximum itt is 100, illetve valós értékeket vehet fel
A játékban gyűjteni kell különböző nyersanyagokat a túlélés érdekében:

Ezek az eszközök készítéséhez elengedhetetlenek: Eszköz neve Farönk Kő Fű Gally Virág

A fenti táblázat mutatja, hogy az egyes eszközök előállításához milyen nyersanyagok kellenek, milyen mennyiségben. Nem kötelező a fenti értékeket használni, de arányaiban hasonlók legyenek.
A nyersanyagok a szárazföldön helyezkednek el, minden mezőn legfeljebb egyféle. A szárazföld legalább 50%-a szabad kell, hogy legyen. A különböző nyersanyagok különböző valószínűséggel fordulnak elő, melyek a lenti táblázatban megtalálhatók (nem kötelező pontosan betartani, de arányaiban érdemes hasonlónak lennie). Néhány nyersanyag begyűjtéséhez szükséges valamilyen eszköz, ezt előbb elő kell állítanunk.
Ezeket az információkat az alábbi táblázat tartalmazza: Név Szükséges eszköz Kapott nyersanyag gyakoriság

Az eszközök egy idő után tönkremennek, tehát újat kell gyártani belőlük:
• fejsze: 10 fa kivágása után tönkremegy
• csákány: 7 kő kibányászása után tönkremegy
• tábortűz: a meggyújtás napjának végéig (éjszaka végéig) tart, utána kialszik
• virágkoszorú: 15 napig tart ki, utána hatását veszti
Az életben maradáshoz szükséges 0-nál nagyobb értéken tartani az életünket, éhségünket és agyunkat. Ezek folyamatosan csökkennek, növelnünk kell őket, hogy ne haljunk meg.
• Az éhség cselekvéspontonként 0.4-del csökken.
• Az agyunk nappal nem változik, éjszaka azonban felhasznált cselekvéspontonként 0.4-gyel csökken (lásd: később). Ha van virágkoszorúnk, akkor nappal cselekvéspontonként 0.05-tel nő, éjszaka cselekvéspontonként 0.3-mal csökken.
Továbbá minden virág felvétele után 2-vel nő agyunk épsége.
• Az életünk alapvetően nem csökken
Táplálékot több módon is szerezhetünk:
• Bogyókat gyűjthetünk (ezek bokrokon teremnek, onnan tudjuk leszedni őket, hasonlóképpen a gyűjthető nyersanyagokhoz, előfordulási esélye 1-3%)
• Répát gyűjthetünk (hasonlóképpen a bogyókhoz, előfordulási esélye 1-2%)
• A fenti nyers táplálékokat megfőzhetjük, ekkor változnak a nyújtott hatásai (nem kötelező pontosan betartani ezeket az értékeket, de érdemes hasonlókat választani): Táplálék neve Éhség Élet Agy

A játék napokra osztott. Minden nap két részből áll: nappal és éjszaka. Nappal 75 cselekvéspontunk van, éjszaka 25. Tehát miután elhasználtuk a 75 cselekvéspontunkat, beesteledik, majd ha ismét elköltünk 25-öt, akkor újra nappal lesz (jön a második nap).
Az alábbi táblázatban látható az egyes cselekvések költsége:
Cselekvés
Költség (cselekvéspont)
Egy egységnyi távolság megtétele vízszintes vagy függőleges irányban
1
Várakozás (nem szeretnénk semmit csinálni: egy helyben maradunk)

Action karakter
Az éjszaka annyiban különbözik a nappaltól, hogy sötét van. Ilyenkor karakterünk nem lát, tehát kell egy tábortűz, ami a fényt biztosítja. A tábortűz az éjszaka végéig marad “életben”, utána kialszik, újat kell gyártani. Ha éjszaka nem vagyunk egy tábortűztől legfeljebb 3 távolságra, akkor elköltött cselekvéspontokként az életünk 5-tel, az agyunk épsége 7-tel csökken.
Mivel a játék területe elég nagy, így nem láthatjuk be az egészet egyszerre. Akkora részét rajzoljuk ki egyszerre, amekkora kifér a képernyőre úgy, hogy a többi információ is megjelenik (pl. hátralévő cselekvéspontok száma, nyersanyagok mennyisége…). Ezt például megtehetjük úgy, hogy a kirajzolt terület közepén vagyunk, és ha elmegyünk balra, akkor csak eltoljuk a kirajzolt területet egyel (és ennek továbbra is a közepén leszünk).
Egy példa a terület egy részének aktuális kinézetére:
A játékosnak a játék indulásakor legyen lehetősége felüldefiniálni a beépített táplálék-értékeket (az egyes táplálékokért mennyi éhség, élet és agy jár). Ezeket a felüldefiniált értékeket egy felhasználó által megadott fájlból olvassuk be. A fájl formátuma tetszőleges.
Linkek
Játék linkje: http://store.steampowered.com/app/219740
Wiki: http://dontstarve.wikia.com/wiki
Videó: https://www.youtube.com/watch?v=FXRRz8q6Xi8
Megjegyzések
A fent szereplő számértékek csak tájékoztató jellegűek, tehát lehet választani más (saját) értékeket is, hogy a játék hatékonyságát növeljük.
Javítási útmutató
Funkcionális követelmény
• Van létrehozott pálya, legalább 100x100-as méretű. Van rajta szárazföld és víz. Ha a víz a pálya közepén van, akkor az mindig legalább 20 egybefüggő területből áll - 5%
• Van egy karakterünk, akivel tudunk mozogni a pályán. A karakterrel nem lehet kimenni a pályáról és a vízbe sem tudunk belemenni (pl. hibás input esetén nem történik semmi) - 5%
• Meg van valósítva a karakter 3 szükséglete (élet, éhség, agy). Az éhség és agy a megadott szabály alapján csökken. Amennyiben az éhség vagy életerő 0-ra csökken, a játék véget ér - 5%
• A mezőkön vannak nyersanyagok, ezek véletlenszerűen vannak generálva (azaz nem mindig ugyanott vannak). Egy mezőn csak legfeljebb egy nyersanyag van. A vízben nincs nyersanyag. A szárazföldek legalább 50%-a szabad marad minden esetben - 5%
• A játékos össze tudja gyűjteni a pályán található alap nyersanyagokat (fű, gally, virág), ezek eltárolásra kerülnek, mindig látjuk, hogy melyikből mennyi van (vagy bármikor le tudjuk kérdezni) - 5%
• A játékos össze tudja gyűjteni a pályán található, eszközt igénylő nyersanyagokat (farönk, kő), ezeket csak akkor tudja begyűjteni, ha megvan hozzá a szükséges eszköze - 5%
• A játékos a meglévő nyersanyagokból eszközöket tud előállítani (fejsze, csákány, tábortűz és virágkoszorú). Az eszközök a megadott feltételek mentén egy idő után tönkremennek - 5%
• Tudunk táplálékot (bogyókat, répát) gyűjteni a térképen és meg tudjuk őket enni nyersen - 5%
• A táplálékokat meg tudjuk főzni, ilyenkor ezek hatásai megváltoznak. A főtt táplálékokat is meg tudjuk enni - 5%
• A cselekvéspontok meg vannak valósítva. Minden nap megadott cselekvéspont mennyiség áll rendelkezésre, ha azok elfogynak, akkor új nap következik. Az egyes cselekvéseknek meg van a cselekvéspont költségük (nem mindegyik cselekvés ugyanannyi cselekvéspontba kerül). Meg van valósítva a nappalok és éjszakák váltakozása. Az éjszaka során megadott környezetben lévő tábortűz nélkül az életünk és agyunk a megadott mennyiségekkel csökken - 5%
• Nem látszódik egyszerre a teljes pálya, hanem annak csak egy részlete. A többi hasznos információ megjelenik a képernyőn (cselekvéspontok, nyersanyagok, tárgyak) - 5%
• A megadott táplálék értékeket felül lehet definiálni egy megadott fájl segítségével, de a játék anélkül is működik a beépített értékekkel - 5%
Megvalósítási követelmény
• A program tartalmaz legalább 5 különböző, értelmes osztályt, amelyek egy-egy, a játékhoz kapcsolódó entitást írnak le - 5%
• A programok az osztályok funkcionalitásuk alapján package-ekbe vannak rendezve - 5%
• A programban szerepel legalább 2 olyan osztály, aminek van több, értelmes gyerekosztálya - 5%
• Minden osztálynak 1 (egy) meghatározott feladata van, egy osztály nem végez több, lényegében különböző műveletet - 5%
• Az osztályok, adattagok és metódusok nevei konvenció szerint vannak elnevezve, a nevek tükrözik az osztályok, metódusok, adattagok feladatait. A program megfelelő módon van indentálva - 5%
• Nincsenek a programban hosszú metódusok. A programban sehol nincs 100 sornál hosszabb metódus, és a metódusok nagy része kevesebb, mint 50 sorból áll. Ezek alól kivételt képeznek
a GUI-val rendelkező programok esetén a grafikus elemek létrehozására, megjelenítésére szolgáló metódusok - 5%
• A program JavaDoc dokumentációval el van látva. Az osztályok mindegyike meg van magyarázva JavaDoc dokumentációval, és a metódusoknak is legalább a 70%-a (a getter és setter metódusokon kívül) - 5%
• A program fel van készülve érvénytelen felhasználói inputokra. Ezek vagy meg vannak tiltva, vagy le vannak kezelve. Pl. nem létezik a megadott fájl, olyan cselekvést szeretnénk végrehajtani, ami az adott helyzetben nem megengedett, szám helyett szöveget adunk meg, nem a megfelelő értéktartományból írunk be értékeket, stb. Az ilyen esetek nagy része le van kezelve - 5%
