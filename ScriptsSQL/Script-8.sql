CREATE VIEW view_livros_comprados AS
SELECT 
    livro.título,
    livro.autor,
    livroscomprados.preco
FROM 
    livro
INNER JOIN 
    livroscomprados
ON 
    livro.id = livroscomprados.livro_id;
SELECT * FROM view_livros_comprados;
