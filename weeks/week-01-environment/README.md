# Semana 01 – Ambiente e Setup

## 🎯 Big Picture
Nenhum sistema real começa sem ambiente.
Padronizar o setup reduz bugs, atritos e atrasos em times de verdade — e é o que separa
"alguém que assistiu vídeo de Java" de "alguém que consegue codar de fato".

---

## 🧩 Conexão com o Projeto Final
Esta semana **funda** o Projeto Final:
- A GitHub Organization do squad será a casa de todo o código do bootcamp.
- O repositório `projeto-final` nasce **vazio mas versionado** já nesta aula.
- O primeiro `Hello World` é a primeira prova de que o ambiente roda fim a fim.

> Sem ambiente funcionando, nenhuma das próximas 11 semanas faz sentido.

---

## 🚀 MVP da Semana (Obrigatório)
Durante a aula, em squad:

- Criar a **GitHub Organization** do squad
- Criar os dois repositórios:
    - `practice` → exercícios semanais
    - `projeto-final` → sistema do Demo Day
- Instalar **JDK (OpenJDK 21+)** e uma **IDE** (IntelliJ IDEA Community recomendado)
  > ⚠️ **Todos do squad** devem instalar a IDE na própria máquina.
  > Acompanhe o vídeo oficial: https://www.youtube.com/@JetBrainsTV
  > Documentação de instalação: https://www.jetbrains.com/help/idea/installation-guide.html
  > Lição de casa obrigatória: instalar, abrir o projeto e fazer **pelo menos 1 commit** da sua máquina.
  > Apenas desenvolver não cria o hábito de debugar, navegar pelo projeto
  > e encontrar bibliotecas — esses hábitos só se formam **com a IDE aberta na sua máquina**.
- Habilitar o **GitHub Copilot** na IDE (free tier serve)
- Rodar e versionar um `Hello World` em Java em **ambos os repos**
- Adicionar um `README.md` no `projeto-final` com 3 linhas: nome, ideia inicial, integrantes

📌 Onde commitar:
- `Hello World` e brincadeiras → `practice`
- README inicial e Hello World do squad → `projeto-final`

---

## 🎮 Side Quest (Opcional)
- Rodar o projeto via Docker (`openjdk` image)
- Configurar `.gitignore` adequado para Java/IntelliJ
- Criar um GitHub Project (board) e linkar nos dois repositórios

---

## 🛠 Conteúdo Técnico
- O que é JDK, JVM e JRE (e por que importam)
- Estrutura mínima de um projeto Java
- Git e GitHub: clone, add, commit, push
- Primeiro commit consciente (mensagem clara, escopo pequeno)
- IDE: estrutura, terminal integrado, atalhos básicos

---

## 🧠 Debug & Desenvolvimento Mental
- "Funciona na minha máquina" — por que padronizar versão do JDK
- Ler a primeira linha do erro de compilação antes da última
- Diferença entre erro de compilação e erro em tempo de execução
- Hábito: rodar → commitar → push **antes** de continuar

---

## 🤖 Second Brain – Uso Consciente de IA
Use IA para: entender o que é programação, esclarecer termos, criar visão geral.

❌ Não use IA para: pular o setup, colar comandos sem entender o que fazem.

### Prompt sugerido
> Explique o que é programação e como um programa Java é executado, do código até rodar
> no computador, com linguagem simples e analogias do dia a dia.

---

## 🧠 Contexto para IA (Second Brain do squad)
```
Semana 01 – Ambiente e Setup
Objetivo: instalar JDK, IDE, criar org e repos, rodar Hello World.
Conceitos-chave: JDK, JVM, JRE, Git, GitHub, commit, push.
Domínio do projeto: a definir pelo squad (sugestão padrão: gestão de produtos).
Decisões já tomadas: nenhuma — semana inicial.
O que NÃO usar ainda: classes além de Main, coleções, frameworks.
```

---

## 📚 Referências
Material completo em [`./references.md`](./references.md).

---

## 📁 Exemplos
- [`examples/HelloWorld.java`](./examples/HelloWorld.java) — o menor programa Java possível.


## ✅ Checklist de Entrega
- [ ] Organização criada no GitHub
- [ ] Repos `practice` e `projeto-final` criados
- [ ] JDK + IDE + Copilot funcionando **na máquina de cada membro do squad**
- [ ] Hello World rodando e versionado **com commit de cada integrante**
- [ ] README do `projeto-final` com ideia inicial do squad

