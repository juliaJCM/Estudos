import os

restaurantes = [{"nome":"Burger King", "categoria":"Fast-Food", "ativo":False},
                {"nome":"Gokei", "categoria":"Japonesa", "ativo":True},
                {"nome":"Domino's", "categoria":"Pizza", "ativo":False},]

def exibir_nome_do_programa():
    """Função responsável por exibir no topo da tela o nome da aplicação"""
    print('𝕊𝕒𝕓𝕠𝕣 𝔼𝕩𝕡𝕣𝕖𝕤𝕤\n')

def exibir_opcoes():
    """Função responsável por exibir para o usuário as opções dispníveis da aplicação"""
    print("1. Cadastrar Restaurante")
    print("2. Listar Restaurante")
    print("3. Alternar estado do Restaurante")
    print("4. Sair \n")

def finalizar_app():
    """Função responsável por exibir para o usuário quando o programa está sendo encerrado"""
    exibir_subtitulo("Encerrando o programa")

def retorna_ao_menu_principal():
    """Função responsável por exibir uma mensagem para retornar ao menu principal assim que o usuário selecionar uma tecla qualquer"""
    input("\nDigite uma tecla para voltar ao menu principal: ")
    main()

def exibir_subtitulo(texto):
    """Função responsável por limpar o terminal e acrescentar uma sequência de '*' ao redor dos títulos"""
    os.system("cls")
    linha = "*" * (len(texto))
    print(linha)
    print(texto)
    print(linha)
    print()

def opcao_invalida():
    """Função responsável por exibir para o usuário uma mensagem específica assim que uma opção que não esteja disponível seja selecionada"""
    print("Opção inválida")
    retorna_ao_menu_principal()

def cadastrar_novo_restaurante():
    """Função resonsável por criar um novo restaurante e aramezena-lo na lista criada"""
    exibir_subtitulo("ℂ𝕒𝕕𝕒𝕤𝕥𝕣𝕠 𝕕𝕖 ℕ𝕠𝕧𝕠𝕤 ℝ𝕖𝕤𝕥𝕒𝕦𝕣𝕒𝕟𝕥𝕖𝕤")
    nome_do_restaurante = input("Digite o nome do restaurante que deseja cadastrar: ")
    categoria = input(f"\nDigite a categoria do {nome_do_restaurante}: ")
    info_restaurante = {"nome": nome_do_restaurante, "categoria": categoria, "ativo": False}
    restaurantes.append(info_restaurante)
    print(f"\nO restaurante {nome_do_restaurante} foi cadastrado com sucesso!")
    retorna_ao_menu_principal()

def listar_restaurantes():
    """Função responsável por exibir para o usuário todos os restaurantes que estão armazenados dentro da lista criada"""
    exibir_subtitulo("𝕃𝕚𝕤𝕥𝕒𝕣 ℝ𝕖𝕤𝕥𝕒𝕦𝕣𝕒𝕟𝕥𝕖𝕤")

    print(f"{"NOME DO RESTAURANTE".ljust(22)} | {"CATEGORIA".ljust(20)} | STATUS")
    for restaurante in restaurantes:
        nome_restaurante = restaurante["nome"]
        categoria = restaurante["categoria"]
        ativo = "ativado" if restaurante["ativo"] else "desativado"
        print(f"- {nome_restaurante.ljust(20)} | {categoria.ljust(20)} | {ativo}")

    retorna_ao_menu_principal()

def alternar_estado_restaurante():
    """Função responsável por alternar o status de um restaurante"""
    exibir_subtitulo("Alternando estado")

    nome_restaurante = input("Digite o nome do restaurante que deseja alternar o estado: ")
    restaurante_encontrado = False

    for restaurante in restaurantes: 
        if nome_restaurante == restaurante["nome"]:
            restaurante_encontrado = True
            restaurante["ativo"] = not restaurante["ativo"]
            mensagem = f"\nO restaurante {nome_restaurante} foi ativdado com sucesso!" if restaurante["ativo"] else f"\nO restaurante {nome_restaurante} foi desativado com sucesso!"
            print(mensagem)

    if not restaurante_encontrado:
        print("O restaurante não foi encontrado")

    retorna_ao_menu_principal()

def escolher_opcao():
    """Função responsável por validar a opção selecionada pelo usuário"""
    try:
        opcao_escolhida = int(input("Escolha uma opção: "))
        print(f"Você escolheu a opção: {opcao_escolhida}\n")

        if opcao_escolhida == 1:
           cadastrar_novo_restaurante()
        elif opcao_escolhida == 2:
            listar_restaurantes()
        elif opcao_escolhida == 3:
            alternar_estado_restaurante()
        elif opcao_escolhida == 4:
            finalizar_app()
        else:
            opcao_invalida()
    except:
        opcao_invalida()

"""if opcao_escolhida == 1:
    print("Cadastrar Restaurantes")
elif opcao_escolhida == 2:
    print("Listar Restaurantes")
elif opcao_escolhida == 3:
    print("Ativar Restaurante")
else:
    print("Encerrando programa")"""

def main():
    """Função responsável por exibir para o usuário o menu principal da aplicação"""
    os.system("cls")
    exibir_nome_do_programa()
    exibir_opcoes()
    escolher_opcao()

if __name__ == "__main__":
    main()