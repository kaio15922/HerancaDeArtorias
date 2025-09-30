package DescricaoSalas;

public class Descricoes {
    /*Acho melhor deixar todas as decricoes em uma classe e so chamar no codigo -> evita que esse monte
    de texto apareca no "codigo principal"*/

    private final String sala1 = "Vilarejo inicial: Você sempre sonhou em se tornar um herói, mas " +
            "diferente dos outros que abandonaram esse sonho, você não o largou, e finalmente na idade adulta, " +
            "está na hora de começar a sua jornada. Alguns dias atrás, o rei emitiu um alerta para a Guilda de " +
            "aventureiros, a respeito de uma missão de emergência. Um enorme dragão vermelho atacou a capital, " +
            "e sequestrou a princesa, levando-a para o leste. Esta é a sua chance de se tornar o herói que você " +
            "sempre sonhou.";

    private final String sala2 = "Rota: Você parte do vilarejo onde você cresceu, para sua aventura. " +
            "Você é acompanhado por uma brisa suave, enquanto marcha rumo ao vilarejo vizinho.";

    private final String sala3 = "Vilarejo Vizinho: Chegando no vilarejo, você se hospeda numa taberna, " +
            "enquanto planeja sua próxima viagem. Você ouve rumores de que algumas pessoas têm desaparecido na " +
            "floresta ao qual você vai atravessar.";

    private final String sala4 = "Floresta: Atravessando a floresta densa, você encontra uma área com 3 caminhos. ";

    private final String sala5 = "Rota: Durante o caminho você encontra trilhas na vegetação, aparentemente " +
            "feitas por pequenas criaturas. Os Goblins parecem ter vindo por deste caminho.";

    private final String sala6 = "Rota: Os sinais de Goblins se intensificam fortemente.";

    private final String sala7 = "Lixão: Você encontra uma pilha de pertences, incluindo bolsas e roupas " +
            "ensanguentadas, e decide dar uma olhada.";

    private final String sala8 = "Rota: Você avista a toca dos Goblins, uma caverna com carcaças de animais " +
            "e pessoas ornamentando a entrada. Parece ter algumas outras coisas espalhadas pelo chão.";

    private final String sala9 = "Caverna Goblin: Você entra na caverna e explora ela até encontrar o ninho deles. " +
            "Ao ser avistado você é atacado, mas derrota facilmente os Goblins, até que enfim, o líder deles se levanta " +
            "do seu trono de ossos para te enfrentar.";

    private final String sala10 = "Rota: Você segue uma trilha com pegadas na vegetação. Parecem pegadas humanas.";

    private final String sala11 = "Rota: Você finalmente chega no que parece ser um acampamento, onde você vê " +
            "pessoas descansando ao redor de uma fogueira.";

    private final String sala12 = "Acampamento: Você entra no acampamento e conversa com as pessoas que estão ali. " +
            "São um grupo de aventureiros, que estão investigando o desaparecimento de pessoas na floresta. Eles deixam " +
            "você passar a noite e lhe desejam boa sorte na sua jornada.";

    private final String sala13 = "Rota: Você marcha rumo ao seu objetivo, atravessando a floresta.";

    private final String sala14 = "Rota: Saindo da floresta, você caminha por uma enorme planície, frente a um desfiladeiro.";

    private final String sala15 = "Ponte quebrada: Você chega ao desfiladeiro, porém a ponte está quebrada. " +
            "Parece que algo grande passou por ela.";

    private final String sala16 = "Rota: Você caminha por uma área rochosa.";

    private final String sala17 = "Rota: Você sente um cheiro podre próximo.";

    private final String sala18 = "Sala: Você encontra uma pilha de cadáveres ainda com seus pertences, e decide dar uma olhada.";

    private final String sala19 = "Rota: Você consegue ver uma gruta próxima.";

    private final String sala20 = "Rota: Você entra na gruta que abrigava um grupo de Goblins.";

    private final String sala21 = "Rota: Você adentra no lugar onde os Goblins guardam seus tesouros, que incluem " +
            "bugigangas, ouro e alguns pertences pessoais de suas vítimas.";

    private final String sala22 = "Rota: Você começa a dar a volta no desfiladeiro. O caminho parece ser longo.";

    private final String sala23 = "Rota: No meio do caminho, você se depara com um mercante viajante.";

    private final String sala24 = "Cidade: Você chega em uma cidade construída a beira do precipício. " +
            "Viajantes são muito bem vindos.";

    private final String sala25 = "Arredores: Você caminha pelos arredores da cidade. O ar fresco tira o peso das costas.";

    private final String sala26 = "Vítima: Você encontra uma vítima de um ataque Goblin. Ainda parece estar com seus pertences.";

    private final String sala27 = "Estátua: Você encontra uma praça, cujo possui uma fonte com a estátua de um grande " +
            "herói do passado. Você se enche de determinação.";

    private final String sala28 = "Rota: Você caminha para continuar sua jornada.";

    private final String sala29 = "Fim do Desfiladeiro: Você chega ao fim do desfiladeiro.";

    private final String sala30 = "Rota: Você adentra numa floresta encantada.";

    private final String sala31 = "Lago: Você encontra um lago escondido. Uma fada emerge do lago, ao sentir o seu espírito heróico.";

    private final String sala32 = "Rota: Você descansa em um lugar aberto, enquanto admira o céu estrelado.";

    private final String sala33 = "Rota: Você sai da floresta encantada.";

    private final String sala34 = "Rota: Você segue confiante rumo ao seu objetivo.";

    private final String sala35 = "Rota: Você sente que a jornada se aproxima do fim.";

    private final String sala36 = "Acampamento de Bandidos: Você encontra um acampamento de Bandidos, e os afugenta.";

    private final String sala37 = "Rota: Você encontra uma carruagem saqueada. Parece que deixaram algumas coisas.";

    private final String sala38 = "Rota: Você consegue ver uma caverna enorme no horizonte.";

    private final String sala39 = "Caverna: Você adentra na caverna. Você consegue ouvir o dragão dormindo. " +
            "O ninho do dragão parece estar adiante.";

    private final String sala40 = "Ninho do Dragão: Você invade o ninho do dragão. Você consegue ver a princesa " +
            "presa numa jaula, numa pilha de ouro, jóias e tesouros. Você grita desafiando a fera, que desperta para a batalha final.";

    //Construtor da classe:
    public Descricoes(){

    }

    //Criando getters para retornar as descricoes da cada sala:
    public String getDescricaoSala1(){
        return sala1;
    }

    public String getDescricaoSala2(){
        return sala2;
    }

    public String getDescricaoSala3(){
        return sala3;
    }

    public String getDescricaoSala4(){
        return sala4;
    }

    public String getDescricaoSala5(){
        return sala5;
    }

    public String getDescricaoSala6(){
        return sala6;
    }

    public String getDescricaoSala7(){
        return sala7;
    }

    public String getDescricaoSala8(){
        return sala8;
    }

    public String getDescricaoSala9(){
        return sala9;
    }

    public String getDescricaoSala10(){
        return sala10;
    }

    public String getDescricaoSala11(){
        return sala11;
    }

    public String getDescricaoSala12(){
        return sala12;
    }

    public String getDescricaoSala13(){
        return sala13;
    }

    public String getDescricaoSala14(){
        return sala14;
    }

    public String getDescricaoSala15(){
        return sala15;
    }

    public String getDescricaoSala16(){
        return sala16;
    }

    public String getDescricaoSala17(){
        return sala17;
    }

    public String getDescricaoSala18(){
        return sala18;
    }

    public String getDescricaoSala19(){
        return sala19;
    }

    public String getDescricaoSala20(){
        return sala20;
    }

    public String getDescricaoSala21(){
        return sala21;
    }

    public String getDescricaoSala22(){
        return sala22;
    }

    public String getDescricaoSala23(){
        return sala23;
    }

    public String getDescricaoSala24(){
        return sala24;
    }

    public String getDescricaoSala25(){
        return sala25;
    }

    public String getDescricaoSala26(){
        return sala26;
    }

    public String getDescricaoSala27(){
        return sala27;
    }

    public String getDescricaoSala28(){
        return sala28;
    }

    public String getDescricaoSala29(){
        return sala29;
    }

    public String getDescricaoSala30(){
        return sala30;
    }

    public String getDescricaoSala31(){
        return sala31;
    }

    public String getDescricaoSala32(){
        return sala32;
    }

    public String getDescricaoSala33(){
        return sala33;
    }

    public String getDescricaoSala34(){
        return sala34;
    }

    public String getDescricaoSala35(){
        return sala35;
    }

    public String getDescricaoSala36(){
        return sala36;
    }

    public String getDescricaoSala37(){
        return sala37;
    }

    public String getDescricaoSala38(){
        return sala38;
    }

    public String getDescricaoSala39(){
        return sala39;
    }

    public String getDescricaoSala40(){
        return sala40;
    }
}
