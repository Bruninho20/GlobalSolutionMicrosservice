# Global Solution Microsserviço
Bem vindo(a), esta é a entrega da matéria de Microsservice and Web Engineering, utilizando todo o conteúdo abordado no segundo semestre.

# Integrantes:

- Bruno Henrique Ferraz da Silva - RM 87740
- João Henrique Pinto - RM 86913
- João Pedro Meirelles - RM 84775

## Back-End
Nosso back-end, foi desenvolvido utilizando a tecnologia SpringBoot.
Para o banco de dados, utilizamos OracleDataBase, na seguinte modelagem:

Esse é modelo lógico:
![image](https://github.com/Bruninho20/GlobalSolutionMicrosservice/assets/99261881/0f8dd010-8318-4dcf-809f-7970bd5d5a52)

Esse é o modelo relacional:
![image](https://github.com/Bruninho20/GlobalSolutionMicrosservice/assets/99261881/35cd8966-6d1d-4dfd-9ca2-995dfc850894)


Swagger da aplicação:

<img width="947" alt="image" src="https://github.com/Bruninho20/GlobalSolutionMicrosservice/assets/99261881/8137b287-424c-4ec4-8a61-774c9c77265b">

Retorno da aplicação do endpoint /objetivos:

<img width="850" alt="image" src="https://github.com/Bruninho20/GlobalSolutionMicrosservice/assets/99261881/0163e3ae-e83d-48c5-b55b-80eb64853ea7">

Retorno da aplicação do endpoint /indicador/{indicadorKey}

<img width="860" alt="image" src="https://github.com/Bruninho20/GlobalSolutionMicrosservice/assets/99261881/8f830c38-e4aa-4a88-b2c5-3dbe01dd5b4d">

Para iniciar, adicione este Dockerfile na raiz do projeto:
<img width="701" alt="image" src="https://github.com/Bruninho20/GlobalSolutionMicrosservice/assets/99261881/d61a38aa-f5a8-463d-8b7c-76ae32cbb1a3">


## Instruções para criar a imagem no Docker
Rode esses comandos no terminal PowerShell, note-se que o nome da imagem é "api"...

$ docker build . -t api

$ docker run -p 8080:8080 api
---------------------------------------------------------------------------

Ao criar, a imagem aparecerá da seguinte forma do Dockerfile:
<img width="743" alt="image" src="https://github.com/Bruninho20/GlobalSolutionMicrosservice/assets/99261881/7d6ffbfa-96c2-478f-9b48-20fe4f65141a">

inicie o container da aplicação clicando no play.
Ao iniciar a aplicação ficará disponível, no caso na porta 8080 neste [link](http://localhost:8080/swagger-ui/index.html#/)  .

Pronto o back-end da aplicação ja está rodando com o Docker.




