from tabulate import tabulate

# Dados da tabela (lista de listas)
data = [
    ["Função", "Tamanho", "Tempo", "Contador"],
    ["gera_vetor", "", "", ""],
    ["MaxVal1"],
    ["MaxVal2"],
    ["multiply"]
]

# Criar a tabela
print(tabulate(data, headers="firstrow", tablefmt="grid"))
