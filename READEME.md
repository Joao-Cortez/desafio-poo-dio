# Desafio POO - Bootcamp DIO

## Sobre o projeto

Este projeto simula um **Bootcamp de programação** utilizando **Java POO (Programação Orientada a Objetos)**.
O sistema gerencia **Cursos, Mentorias, Bootcamps e Devs**, permitindo acompanhar o progresso e XP dos participantes.

---

## Estrutura do código

- **Conteudo.java**: classe abstrata base para **Curso** e **Mentoria**, com método `calcularXP()`.
- **Curso.java**: extensão de Conteudo, com `cargaHoraria`.
- **Mentoria.java**: extensão de Conteudo, com `data` da mentoria.
- **Bootcamp.java**: gerencia conteúdos e devs inscritos.
- **Dev.java**: representa o participante; controla conteúdos inscritos, concluídos, XP e nível.
- **NivelDev.java**: enumeração dos níveis possíveis (BRONZE, PRATA, OURO).
- **Main.java**: classe principal que demonstra a execução do sistema.

---

## Melhorias implementadas

1. **Builder Pattern para Cursos**
    - Antes: criação de cursos usando vários `set()`s.
    - Depois: uso de `Curso.Builder()` para criar objetos de forma clara e enxuta.
    - **Impacto:** código mais legível e fácil de manter.

2. **Sistema de Níveis (`NivelDev`)**
    - Adicionado enum `NivelDev` (BRONZE, PRATA, OURO).
    - `Dev.getNivel()` calcula o nível automaticamente com base no XP acumulado.
    - **Impacto:** gamificação, facilita identificar progresso do dev e evita valores inconsistentes.

3. **Método `mostrarProgresso()` em Dev**
    - Mostra conteúdos inscritos, concluídos, XP e nível do dev.
    - **Impacto:** exibe o progresso de forma organizada e profissional no console.

4. **Ranking de Devs no Bootcamp**
    - `Bootcamp.mostrarRankingDevs()` ordena os devs pelo XP.
    - **Impacto:** cria uma visão clara da performance de cada participante, simulando um leaderboard real.

---

## Como o código funciona

1. **Criação de conteúdos**: cursos e mentorias são criados e adicionados ao bootcamp.
2. **Inscrição de devs**: devs se inscrevem no bootcamp e recebem todos os conteúdos.
3. **Progresso do dev**: ao chamar `progredir()`, o dev conclui um conteúdo e ganha XP.
4. **Cálculo de XP e nível**: `calcularTotalXp()` soma XP dos conteúdos concluídos; `getNivel()` retorna o nível correspondente.
5. **Exibição de progresso e ranking**: `mostrarProgresso()` mostra status do dev; `mostrarRankingDevs()` exibe o ranking de todos os devs do bootcamp.

---

## Impacto das alterações

- **Código mais limpo e legível**: Builder Pattern e métodos organizados.
- **Gamificação realista**: XP e níveis permitem acompanhamento de evolução.
- **Profissionalismo**: ranking e progresso tornam o sistema mais próximo de um produto real.
- **Manutenção facilitada**: enums e métodos centralizados evitam duplicidade e inconsistências.

---

## Exemplo de execução no console:

===== BOOTCAMP JAVA DEVELOPER =====

===== DEV JOÃO =====

Conteúdos inscritos:
[Curso{titulo='Curso Java', descricao='Descrição curso Java', cargaHoraria=8}, Curso{titulo='Curso JS', descricao='Descrição curso JS', cargaHoraria=4}, Mentoria{titulo='Mentoria de Java', descricao='Descrição mentoria Java', data=2026-03-07}]

Conteúdos restantes:
[]

Conteúdos concluídos:
[Curso{titulo='Curso Java', descricao='Descrição curso Java', cargaHoraria=8}, Curso{titulo='Curso JS', descricao='Descrição curso JS', cargaHoraria=4}, Mentoria{titulo='Mentoria de Java', descricao='Descrição mentoria Java', data=2026-03-07}]

XP total: 150.0
Nível: OURO

-----------------------------

===== DEV MARIANA =====

Conteúdos inscritos:
[Curso{titulo='Curso Java', descricao='Descrição curso Java', cargaHoraria=8}, Curso{titulo='Curso JS', descricao='Descrição curso JS', cargaHoraria=4}, Mentoria{titulo='Mentoria de Java', descricao='Descrição mentoria Java', data=2026-03-07}]

Conteúdos restantes:
[Curso{titulo='Curso JS', descricao='Descrição curso JS', cargaHoraria=4}, Mentoria{titulo='Mentoria de Java', descricao='Descrição mentoria Java', data=2026-03-07}]

Conteúdos concluídos:
[Curso{titulo='Curso Java', descricao='Descrição curso Java', cargaHoraria=8}]

XP total: 80.0
Nível: PRATA

=============================

=== RANKING DE DEVS ===
João - XP: 150.0
Mariana - XP: 80.0
