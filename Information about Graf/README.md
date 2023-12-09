Zmodyfikujmy nieco nasz algorytm przeszukiwania w głąb następująco: 

Algorytm przeszukiwanie grafu w głąb (DFS):

Odwiedzamy wierzchołek 

v (zaznaczamy go jako odwiedzony) i wkładamy go na STOS
Dopóki STOS nie jest pusty wykonuj:
Jeżeli 

v jest wierzchołkiem na wierzchu STOSU, to sprawdzamy czy istnieje wierzchołek sąsiedni z 

v (zgodnie z porządkiem bierzemy najmniejszy z sąsiadów), który nie był jeszcze odwiedzony.
Jeżeli 

u jest takim wierzchołkiem, to odwiedzamy 

u i wkładamy go na stos.
Jeżeli takiego uu nie ma, to zdejmujemy 

v ze stosu.
Napisz program, który wczytuje od użytkownika macierz sąsiedztwa, następnie numer wierzchołka, i przeprowadza przeszukiwanie w głąb tego grafu według powyższej modyfikacji algorytmu. Wynikiem ma być kolejność odwiedzanych wierzchołków w tym grafie oraz informacja czy graf jest spójny czy nie.

W przypadku błędnych danych program ma wypisać komunikat: BŁĄD i ma zakończyć działanie.

Pod ocenę bierze się następujące elementy:

Testy (1.25 pkt)
Złożoność algorytmu (0.5 pkt)
Styl kodu (0.25 pkt)