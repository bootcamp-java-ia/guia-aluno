# 📅 Agenda do Bootcamp Java & IA

Cronograma oficial das aulas. Encontros **toda terça-feira**, **1h30**, com **Malcon** no **Microsoft Teams**.

> Arquivo oficial entregue à academia: [`JAVA BOOTCAMP_DADOS ACADEMIA DA MODA.xlsx`](./JAVA%20BOOTCAMP_DADOS%20ACADEMIA%20DA%20MODA.xlsx)
> (gerado automaticamente por [`tools/build_xlsx.py`](./tools/build_xlsx.py)).

---

## 📋 Agenda (12 terças consecutivas: 16/jun → 01/set)

| Semana | Data    | Tema                            | Breve Descrição                                                                                          | Instrutor | Carga    |
|--------|---------|---------------------------------|----------------------------------------------------------------------------------------------------------|-----------|----------|
| 01     | 16/jun  | Introdução e Ambiente           | Ferramentas e acessos essenciais (GitHub Org, IDE, OpenJDK, Copilot) + Hello World versionado.           | Malcon    | 1h30min  |
| 02     | 23/jun  | Sintaxe Básica                  | Tipos primitivos, operadores, Scanner e saída no console — base de qualquer programa Java.               | Malcon    | 1h30min  |
| 03     | 30/jun  | Controle de Fluxo               | if/else, switch, for/while, break/continue — programa que toma decisões e repete operações.              | Malcon    | 1h30min  |
| 04     | 07/jul  | Estruturas de Dados             | ArrayList, HashMap, iteração e generics — armazenar e percorrer coleções de forma idiomática.            | Malcon    | 1h30min  |
| 05     | 14/jul  | POO I                           | Classes, objetos, atributos, construtores e encapsulamento — modelar o domínio em código.                | Malcon    | 1h30min  |
| 06     | 21/jul  | POO II                          | Herança, polimorfismo e interfaces — reuso consciente e flexibilidade no design.                         | Malcon    | 1h30min  |
| 07     | 28/jul  | Boas Práticas e Organização     | Clean Code, SRP e refatoração segura — código que outras pessoas (e o eu futuro) entendem.               | Malcon    | 1h30min  |
| 08     | 04/ago  | Exceções e Validações           | try/catch/finally, exceções customizadas e mensagens claras — sistema que falha bem.                     | Malcon    | 1h30min  |
| 09     | 11/ago  | Persistência de Dados           | File I/O, try-with-resources e visão geral de JDBC — salvar e carregar estado entre execuções.           | Malcon    | 1h30min  |
| 10     | 18/ago  | CRUD                            | Padrão Repository com Create, Read, Update e Delete em memória + arquivo — esqueleto de qualquer sistema. | Malcon    | 1h30min  |
| 11     | 25/ago  | Segurança e APIs                | HTTP, JSON, endpoints GET/POST e header de autenticação simples — expor o CRUD para o mundo.             | Malcon    | 1h30min  |
| 12     | 01/set  | Projeto Final / Demo Day        | Consolidação, refinamento e apresentação do projeto pelo squad — clareza acima de complexidade.          | Malcon    | 1h30min  |

> Coluna **"LINK DA REUNIÃO VIA TEAMS"** existe no xlsx oficial e deve ser preenchida diretamente lá.

---

## 🔁 Revisões Semanais
A partir da **semana 02**, toda aula **começa** com o quiz da semana anterior.
Sem nota de corte. Material e filosofia em [`reviews/README.md`](./reviews/README.md).

---

## 🔧 Regenerar artefatos
Sempre que alterar conteúdo de quizzes (CSV) ou descrições da agenda:

```bash
python3 tools/build_xlsx.py
```

