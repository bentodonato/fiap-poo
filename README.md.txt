# Projeto Guitarra - [Bento Donato Garcia]

## Informações do Aluno

- **Nome:** [Bento Donato Garcia]
- **RM:** [561621]
- **Turma:** [2CCPO]
- **Curso:** [Ciência da Computação]
- **GitHub:** [@bentodonato]

---

## 🎯 Descrição do Projeto

Este projeto é o resultado do aprendizado nas aulas 1-9 de Programação Orientada a Objetos, onde desenvolvemos o sistema **FiapRide** (aplicativo de mobilidade urbana). Além disso, desenvolvi também o projeto para a minha Classe Guitarra

---

## ✅ Checklist de Implementação

- [x] Aula 1 - Classes e Objetos
- [x] Aula 2 - Métodos
- [x] Aula 3 - Encapsulamento
- [x] Aula 4 - Construtores
- [x] Aula 5 - Associação
- [x] Aula 6 - Herança
- [] Aula 7 - Polimorfismo
- [] Aula 8 - Classes Abstratas
- [] Aula 9 - Interfaces

---

## 🤔 Perguntas de Reflexão

### Aula 1 - Classes e Objetos

**Pergunta:** "Por que precisamos criar uma classe `Passageiro`? Não seria mais fácil apenas criar variáveis soltas no main, como `String nomeAna = "Ana"` e `double saldoAna = 50.0`?

**Pense:** E se o FiapRide tiver 1 milhão de usuários? Como a Classe ajuda a resolver isso?"

**Sua Resposta:**
[A ideia de criar variáveis soltas no main funciona para um exemplo simples,
mas se torna inviável depois. Gerenciar 1 milhão de
guitarras com variáveis como marcaGuitarra1, marcaGuitarra2...
marcaGuitarra1000000... seria impossível de manter ou organizar.
A classe Guitarra resolve isso sendo um molde que eu posso reutilizar: com
uma única definição de classe, conseguimos criar quantos objetos
quisermos com new Guitarra(), cada um com seus próprios valores
de marca, numeroDeCordas e estaAfinada. Além disso, a classe agrupa dados e 
comportamentos no mesmo lugar. Em vez de ter a lógica de afinar espalhada pelo 
código, ela fica dentro do próprio objeto.]

---

### Aula 2 - Métodos

**Pergunta:** "Se nós podemos simplesmente fazer `passageiro.saldo = passageiro.saldo + 100` diretamente no código principal, por que dá tanto trabalho criar um método específico chamado `adicionarSaldo(valor)` para fazer isso? Quais seriam os riscos para a nossa startup de mobilidade se deixássemos qualquer programador alterar o saldo diretamente?"

**Sua Resposta:**
[Realmente, alterar o estado de um objeto diretamente no main parece mais
simples, mas abre muitas brechas. Se qualquer parte do código
puder fazer guitarraDoProfessor.estaAfinada = true sem passar
pelo método afinar(), não há nenhuma garantia de que as regras
do objeto estão sendo respeitadas! O método afinar() existe justamente 
para controlar como o estado vai mudar. Ele é o único lugar onde essa lógica 
vive; se depois precisarmos adicionar uma nova regra, como cobrar um valor par
afinar ou registrar quem afinaram, mudamos só o método, não
precisamos caçar cada linha do main que alterava o atributo.

Em projetos grandes com vários programadores, sem métodos, cada
um alteraria os atributos do seu jeito, sem validação nenhuma.
O método é relacionado ao objeto: ele quem define como deve se
comportar, protegendo o sistema de inconsistências que poderiam surgir.]

---

### Aula 3 - Encapsulamento

**Pergunta:** "No nosso código, os atributos são `private`, mas os métodos `getSaldo()` e `getNome()` são `public`. Por que é seguro deixar o `get` público, mas perigoso deixar o atributo original público?

Pense bem: Qual a diferença entre dar a alguém uma CÓPIA de um documento seu, e entregar o documento ORIGINAL para a pessoa rasurar?"

**Sua Resposta:**
[Quando deixamos o atributo público, qualquer parte do código pode
alterá-lo diretamente, sem passar por nenhuma validação. É como
entregar o documento original direto: a pessoa pode rasurar, apagar e
escrever o que quiser, sem deixar rastro e sem que ninguém controle.
O getter público vai funcionar como uma cópia: quem chama getMarca()
recebe o valor de marca para ler e usar, mas não consegue alterar
o original. O atributo privado continua protegido dentro do objeto.
No projeto, isso significa que qualquer código pode saber
qual é a marca da guitarra com getMarca(), mas ninguém consegue
fazer minhaGuitarra.marca = "marca_falsa" diretamente. A única
forma de mudar o estado do objeto é pelos métodos que nós mesmos
controlamos, onde podemos colocar validações e regras de negócio
da maneira que quisermos.]

---

### Aula 4 - Construtores

**Pergunta:** "Na nossa classe `Veiculo`, nós tomamos duas decisões arquitetônicas muito importantes:

> 1. Nós **não** criamos o método `setModelo()`.
> 2. O `setPlaca()` foi criado como **privado**, e criamos um método público chamado `atualizarPlaca()` para acessá-lo.
>
> Pensando no mundo real e no Clean Code: Por que é um erro gravíssimo clicar em 'Gerar Getters e Setters para tudo' automaticamente na sua IDE? Como as nossas duas decisões acima protegem o sistema de fraudes e falhas de lógica?"

_Dica: Pense sobre o que pode ou não mudar fisicamente em um carro, e a diferença entre "alterar um dado no banco" e "executar um processo real no Detran".

**Sua Resposta:**
[Usar os getters e setters para tudo automaticamente é ruim porque
expõe o controle do objeto para qualquer parte do código, ignorando
as regras de negócio. No mundo real, nem tudo pode ou tem que mudar.
Na classe Guitarra, a marca é imutável: uma Fender nunca vai vira
uma Gibson. Por isso não existe um setMarca() público. Se gerássemos
automaticamente, qualquer programador poderia trocar a marca a
qualquer momento, corrompendo a identidade do objeto.
Já o numeroDeCordas pode mudar, mas só pelo método trocarCordas(),
que valida se o valor é 6 ou 7 antes de alterar. O setNumeroDeCordas()
existe, mas é privado. A diferença é igual no Detran: você não edita a 
placa diretamente no banco de dados, você tem que abrir um processo real com 
regras e validações. O método público é o processo e o setter privado é 
só a escrita final no registro mesmo.]

---

### Aula 5 - Associação

**Pergunta:** "No construtor da `Viagem`, nós exigimos o objeto inteiro (`Passageiro solicitante`). Se o nosso resumo só precisa imprimir o nome da pessoa, não seria mais fácil e mais leve pedir apenas a String do nome no construtor da Viagem (`String nomeDoPassageiro`) em vez do objeto todo?

_Pense nas regras de negócio: O que acontece na hora que a Viagem acaba e o sistema precisa descontar o saldo? Se a Viagem tiver apenas a String "Ana Silva", ela consegue mexer no dinheiro dela?_"

**Sua Resposta:**
[A ideia de passar apenas uma String com o nome é mais simples no início,
mas limita o que o sistema consegue fazer. Se o Guitarrista tivesse
apenas o nome "Bento" em vez do objeto inteiro, ele conseguiria
imprimir quem é o dono da guitarra, mas só isso.
Agora, ao passar o objeto Guitarra inteiro para o Guitarrista, a associação 
acontece: o Guitarrista consegue consultar a marca, saber se está
afinada, chamar afinar() e trocarCordas(), navegado diretamente
pelo objeto. Na referência, quando afinamos a minhaGuitarra fora do 
Guitarrista, o usuário Bento enxergou a mudança, porque os dois apontam 
para o mesmo objeto na memória. Se tivéssemos apenas a String "Fender", 
essa conexão não existiria, ou seja, o sistema saberia o nome da guitarra,
mas não conseguiria interagir com ela.]

---

### Aula 6 - Herança

**Pergunta:** "No nosso código, a mãe `Veiculo` possui os atributos `placa` e `modelo` como `private`. Quando o `Carro` herda de `Veiculo`, ele recebe esses atributos, mas o código dentro de `Carro` NÃO consegue fazer `this.placa = "ABC"`. Ele é obrigado a usar o `super()` ou o `setPlaca()`.

Por que o Java não deixa a filha alterar as variáveis privadas da mãe diretamente? Qual o princípio das aulas passadas que isso está protegendo?"

**Sua Resposta:**
[O Java não vai deixar a filha alterar atributos privados da mãe
diretamente, porque isso violaria o encapsulamento.
Na classe Guitarra, marca e numeroDeCordas são private.
Mesmo que GuitarraEletrica herde tudo de Guitarra, ela não pode
fazer this.marca = "Fender". Ela é obrigada a passar
pelo super(), que vai chamar o construtor da mãe, usando
o setMarca() privado (validação existe).
A mãe Guitarra definiu suas regras de negócio e a filha não pode
simplesmente ignorá-las. O super() é o canal entre mãe e 
filha, garantindo que as regras sempre sejam respeitadas.]

---

### Aula 7 - Polimorfismo

**Pergunta:** "No nosso loop `for (Veiculo veiculo : frota)`, a variável `veiculo` é do tipo genérico `Veiculo`. Se esquecêssemos de criar o método `calcularAutonomia()` lá na classe mãe `Veiculo`, nós conseguiríamos chamá-lo dentro do loop, mesmo sabendo que ele existe dentro do `Carro` e da `Moto`? Por que o contrato precisa existir na base da hierarquia?"

**Sua Resposta:**
[Escreva sua reflexão aqui]

---

### Aula 8 - Classes Abstratas

**Pergunta:** "Pense no mundo real: Faz sentido existir um objeto que é APENAS 'Veículo' sem ser um tipo específico? Você já entrou em uma concessionária e comprou "um veículo" genérico, sem ser carro, moto, caminhão ou nada disso?

Por que, então, no código, precisamos EXPLICITAMENTE dizer ao Java que `Veiculo` é `abstract`? Por que ele não deduz isso sozinho?

Pense: Se esquecermos de colocar `abstract`, qual o risco que corremos? Alguém pode criar `new Veiculo()` e quebrar a lógica do nosso sistema?"

**Sua Resposta:**
[Escreva sua reflexão aqui]

---

### Aula 9 - Interfaces

**Pergunta:** "Por que Java permite herança simples (apenas uma mãe), mas múltipla implementação de interfaces (vários contratos)?

Pense: Se `CarroEletrico` pudesse herdar de `Veiculo` E de `Bateria` ao mesmo tempo (herança múltipla), o que aconteceria se AMBAS as mães tivessem um método chamado `ligar()`?

Como as interfaces resolvem esse problema?"

**Sua Resposta:**
[Escreva sua reflexão aqui]

---

## 🚀 Desafios Técnicos Implementados

### Desafio Pessoal (Seu Projeto)

**Qual foi o domínio que você escolheu para seu projeto pessoal?**
[Responda aqui: ex: Sistema de Biblioteca, Playlist de Música, PetShop, etc.]

**Quais classes você criou?**
[Liste suas classes: ex: Livro, Usuario, Emprestimo]

**Qual foi o maior desafio técnico que você enfrentou?**
[Descreva o desafio e como você o resolveu - 10-15 linhas]

---

## 🎓 Conclusão

**O que você aprendeu nestas 9 aulas?**
[Reflexão final - conte sobre sua jornada de aprendizado]

**Qual conceito foi mais difícil de entender?**
[Qual conceito e como você superou a dificuldade?]

**O que você melhoraria no seu projeto se pudesse refazer?**
[Reflexão crítica sobre seu próprio código]
