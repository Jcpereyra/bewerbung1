
console.clear();
var mark = "";
var container = [4];
let infos = ["p","img","p"];
let ich = [
    "Juan Carlos Pereyra de Leon",
    "30.01.2001",
    "Dominikanische Republik",
    "Alte Ziegelei",
     39,
    "017631182461",
     22

];
const dokumentasion = ["name: ","Born: ","Nationality: ","street: ", "HouseNumber: ", "Tel: ", "age: "]
var meinstateman = document.createElement("div");
function informations(){
    //containe
    var meinstateman2 = document.createElement("div");
    meinstateman2.setAttribute("class","statement1");
    //info conatainer
    meinstateman.setAttribute("class","statement1");
    //meine protokol
    var fläche = document.getElementById("medio");
    fläche.innerHTML = "Informationen Über Juan Carlos Pereyra de leon";
    fläche.style.backgroundImage = "none";
    fläche.style.textAlign = "center";
    fläche.style.fontSize = "40px";
    fläche.style.color = "black";
    fläche.style.backgroundColor = "transparent";
    fläche.style.fontFamily = "Helvetica";
    fläche.style.height = "400px";
    for(var i=0; i<3; i++){
        container[i]=document.createElement(infos[i]);
        switch(i){
            case 0: 
               var liste= document.createElement("ul");
               var content = [7];
               for(var z=0; z<7; z++){
                   content[z]=document.createElement("li");
                   content[z].innerHTML=dokumentasion[z] + ich[z];
                   liste.append(content[z]);
               }
               container[i].append(liste);
               container[i].setAttribute("class", "whoami");
               break;
            case 1: 
               container[i].setAttribute("class", "mea");
               break;
            case 2: 
                 container[i].setAttribute("class", "statement2");
                 container [i].innerHTML = $zusammenfassung(mark);
                 break;
        }
        meinstateman.append(container[i]);

    }
    meinstateman2.append(meinstateman);
    fläche.append(meinstateman2);
    console.log(meinstateman.children.length);
    //My Plan Was to prevent the page to duplicate and i get acess to delete 2 nodes but get some error to delete the second img but somehow a error manage to fix the problemm (EXception)=>TypeError Failed to execute removeChild on Node: parameter 1 is not a type node
    for(var cleaner=meinstateman.children.length; cleaner>=3; cleaner--){
        console.log(meinstateman.childNodes[cleaner]);
        meinstateman.removeChild(meinstateman.childNodes[3]);
        meinstateman.removeChild(meinstateman.childNodes[4]);
        console.clear();
    }
}
function $zusammenfassung(text){
    text="Es fällt mir leicht Algorithmen zu durchschauen und noch leichter fällt es mir sie zu erschaffen. seit einem jahr beschäftige ich mich mit dem Programmieren innerhalb bereitslaufende Systeme. Ich bin eine zielstrebige person die durchaus in der lage ist problemme entgegen zu tretten wenn es nötig sein sollte. während meiner tätigkeiten bin ich stets Teamfähig und unterstütze wo immer es mir möglich ist. ";
    return text;
}

  let prozent=100;
  var what = "%"
function buchverlauf(){
    var feld = document.getElementById("medio");
    feld.style.backgroundImage = "none";
    feld.innerHTML="";
    const label= [11];
    const images = [11];
    const texte= [11];
    const progress = [11];
    const holder=document.createElement("div");
    holder.setAttribute("class","strength");
    holder.innerHTML= "Meine Stärken In der IT:";
    for(var i=0; i<11; i++){
        label[i]=document.createElement("label");
        images[i] = document.createElement("img");
        texte[i] = document.createElement("i");
        progress[i] = document.createElement("div");
        progress[i].innerHTML = prozent+what;
        progress[i].setAttribute("class","progress");
        images[i].innerHTML = "Bild";
        bücher(i,images[i],texte[i]);
        label[i].append(texte[i]);
        label[i].append(images[i]);
        label[i].append(progress[i])
        holder.append(label[i]);
        switch(i){
            case 3:
             progress[3].style.width = "155px";
             progress[3].style.backgroundColor = "orange";
             progress[3].innerHTML = prozent - 75 +what;
             break;
            case 4:
                progress[4].style.width = "250px";
                progress[4].style.backgroundColor = "yellow";
                progress[4].innerHTML = prozent - 50 +what;
                break;
            case 5:
                progress[5].style.width = "450px";
                progress[5].style.backgroundColor = "green";
                progress[5].innerHTML = prozent - 15 +what;
                break;
            case 6:
                progress[6].style.width = "100px";
                progress[6].style.backgroundColor = "red";
                progress[6].innerHTML = prozent - 80 +what;
                break;
            case 8: 
              progress[8].style.width = "200px";
              progress[8].style.backgroundColor = "orange";
              progress[8].innerHTML = prozent - 60 +what;
              break;
            case 9:
                progress[9].style.width = "470px";
                progress[9].style.backgroundColor = "green";
                progress[9].innerHTML = prozent - 12 +what;
                break;
        }
    }
    feld.append(holder);
}
let $buylist=0;
let $books;
let $gefallen=0;
let $gefalleninfos;
function bücher(buch,bücher,labels){
    var korb = document.createElement("div");
    var favorites = document.createElement("div");
    switch(buch){
        case 0:
             bücher.setAttribute("src","bücher/buch0.png");
             labels.innerHTML = "Grundwissen Im IT " + " Progress ⏬";
             //Classes and Ids to identify if the user is interested on buying a book 
             korb.setAttribute("class","korb");
             favorites.setAttribute("class","liebste-bücher");
             korb.setAttribute("id","kaufwafen");
             favorites.setAttribute("id","liebste-bücher");
             labels.append(korb);
             labels.append(favorites);
             break;
        case 1:
             bücher.setAttribute("src","bücher/buch1.jpg");
             labels.innerHTML = "Selbständiges Arbeiten in der Programmiersprache java"+ "/ Progress ⏬";
             //Classes and Ids to identify if the user is interested on buying a book 
             korb.setAttribute("class","korb");
             favorites.setAttribute("class","liebste-bücher");
             korb.setAttribute("id","kaufwafen");
             favorites.setAttribute("id","liebste-bücher");
             labels.append(korb);
             labels.append(favorites);
             break;
        case 2:
             bücher.setAttribute("src","bücher/buch2.jpg");
             labels.innerHTML = "Wissen in den Bereich Web Developement"+ " /Progress ⏬";
             //Classes and Ids to identify if the user is interested on buying a book 
             korb.setAttribute("class","korb");
             favorites.setAttribute("class","liebste-bücher");
             korb.setAttribute("id","kaufwafen");
             favorites.setAttribute("id","liebste-bücher");
             labels.append(korb);
             labels.append(favorites);
             break;

        case 3:
             bücher.setAttribute("src","bücher/buch3.png");
             labels.innerHTML = "Grundwissen in IT mit der Programmiersprache Python" + " /Progress ⏬";
             //Classes and Ids to identify if the user is interested on buying a book 
             korb.setAttribute("class","korb");
             favorites.setAttribute("class","liebste-bücher");
             korb.setAttribute("id","kaufwafen");
             favorites.setAttribute("id","liebste-bücher");
             labels.append(korb);
             labels.append(favorites);
             break;
        case 4: 
              bücher.setAttribute("src","bücher/buch4.jpg");
              labels.innerHTML = "Spaß Projekte mit Arduino UNO und Rasbery pi"+ " /Progress ⏬";
              //Classes and Ids to identify if the user is interested on buying a book 
              korb.setAttribute("class","korb");
              favorites.setAttribute("class","liebste-bücher");
              korb.setAttribute("id","kaufwafen");
              favorites.setAttribute("id","liebste-bücher");
              labels.append(korb);
              labels.append(favorites);
              break;
        case 5: 
              bücher.setAttribute("src","bücher/buch5.jpg");
              labels.innerHTML = "Android App Entwickler mit java" + " /Progress ⏬";
              //Classes and Ids to identify if the user is interested on buying a book 
              korb.setAttribute("class","korb");
              favorites.setAttribute("class","liebste-bücher");
              korb.setAttribute("id","kaufwafen");
              favorites.setAttribute("id","liebste-bücher");
              labels.append(korb);
              labels.append(favorites);
              break;
        case 6:
             bücher.setAttribute("src","bücher/buch6.jpg");
             labels.innerHTML = "Grundwissen Im IT mit der Programmiersprache SWIFT(ios)"+ "/ Progress ⏬";
             //Classes and Ids to identify if the user is interested on buying a book 
             korb.setAttribute("class","korb");
             favorites.setAttribute("class","liebste-bücher");
             korb.setAttribute("id","kaufwafen");
             favorites.setAttribute("id","liebste-bücher");
             labels.append(korb);
             labels.append(favorites);
             break;
        case 7:
             bücher.setAttribute("src","bücher/buch7.jpg");
             labels.innerHTML = "Code Übungen Mit==:"
             +" /Progress ⏬";
             //Classes and Ids to identify if the user is interested on buying a book 
             korb.setAttribute("class","korb");
             favorites.setAttribute("class","liebste-bücher");
             korb.setAttribute("id","kaufwafen");
             favorites.setAttribute("id","liebste-bücher");
             labels.append(korb);
             labels.append(favorites);
             break;
        case 8:
             bücher.setAttribute("src","bücher/buch8.png");
             labels.innerHTML = "Grundwissen Im bereich Ethical hacking mit Linux + 20% powershell"+ " / Progress ⏬";
             //Classes and Ids to identify if the user is interested on buying a book 
             korb.setAttribute("class","korb");
             favorites.setAttribute("class","liebste-bücher");
             korb.setAttribute("id","kaufwafen");
             favorites.setAttribute("id","liebste-bücher");
             labels.append(korb);
             labels.append(favorites);
             break;
        case 9:
             bücher.setAttribute("src","bücher/buch9.png");
             labels.innerHTML = "Grundwissen über datenbanken erschaffen und verarbeiten" + "/ Progress ⏬";
             //Classes and Ids to identify if the user is interested on buying a book 
             korb.setAttribute("class","korb");
             favorites.setAttribute("class","liebste-bücher");
             korb.setAttribute("id","kaufwafen");
             favorites.setAttribute("id","liebste-bücher");
             labels.append(korb);
             labels.append(favorites);
             break;

        case 10:
            bücher.setAttribute("src","bücher/buch10.png");
            labels.innerHTML = "Grundwissen mit der programmiersprache Javascript"+ " /Progress ⏬";
            //Classes and Ids to identify if the user is interested on buying a book 
            korb.setAttribute("class","korb");
            favorites.setAttribute("class","liebste-bücher");
            korb.setAttribute("id","kaufwafen");
            favorites.setAttribute("id","liebste-bücher");
            labels.append(korb);
            labels.append(favorites);
    }
    korb.onclick=function(){
        korb.style.animation ="drive 2s linear";
        $buylist+=1;
    }
    favorites.onclick=function(){
        favorites.style.animation ="drive 2s linear";
        $gefallen+=1;
    }

}
