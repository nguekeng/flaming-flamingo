#insert entrepots
alter table entrepots auto_increment = 1;
insert into entrepots (nom_entrepot) values ('Laval');
insert into entrepots (nom_entrepot) values ('Montréal');
insert into entrepots (nom_entrepot) values ('Longueuil');

#insert fournisseur
alter table fournisseur auto_increment = 1;
insert into fournisseur (nom_fournisseur) values ('Julien bonbon');
insert into fournisseur (nom_fournisseur) values ('Charles bonbon');

#insert categories
alter table categories auto_increment = 1;
insert into categories (nom_categorie) values ('bonbon');
insert into categories (nom_categorie) values ('chocolat');

#insert type_unite
alter table type_unite auto_increment = 1;
insert into type_unite (nom_type_unite) values ('gramme');
insert into type_unite (nom_type_unite) values ('kilo-gramme');

#insert roles
alter table roles auto_increment = 1;
insert into roles (nom_role) values ('admin');
insert into roles (nom_role) values ('livraison');
insert into roles (nom_role) values ('telephone');

#insert client
alter table clients auto_increment = 1;
insert into clients (entreprise, adresse, contact, telephone, description) values ('vendouse', '126 rue Nobel', 'Richard', '450 691-0893', 'C\'est moi');
insert into clients (entreprise, adresse, contact, telephone, description) values ('vendore', '132 rue cablet', 'Roxanne', '450 691-0893', 'C\'est pas moi');
insert into clients (entreprise, adresse, contact, telephone, description) values ('vendu', '1520 rue bonbon', 'John', '450 691-0893', 'C\'est bien moi');
insert into clients (entreprise, adresse, contact, telephone, description) values ('vendaire', '1360 rue barbu', 'Jonathan', '450 691-0893', 'C\'est peut-etre moi');

#insert utilisateurs
alter table utilisateurs auto_increment = 1;
insert into utilisateurs (nom_utilisateur, mot_de_passe, id_role) values ('Richard', '456789', '1');
insert into utilisateurs (nom_utilisateur, mot_de_passe, id_role) values ('John', '789456', '2');
insert into utilisateurs (nom_utilisateur, mot_de_passe, id_role) values ('Juliette', '321654', '3');

#insert commandes
alter table commandes auto_increment = 1;
insert into commandes (id_client, vendeur, date, prix_total) values ('1', '1', '2015-03-16', '250.00');
insert into commandes (id_client, vendeur, date, prix_total) values ('2', '2', '2014-06-16', '250.00');
insert into commandes (id_client, vendeur, date, prix_total) values ('2', '3', '2013-12-16', '250.00');

#insert produit
alter table produits auto_increment = 1;
insert into produits (upc, nom, description, image, id_Categorie, qte_par_paquet, id_type_unite, prix_coutant, prix_vendant, qte_critique, id_fournisseur, si_enleve) 
values ('1234567891', 'barbousse', 'bonbon juteux', 'battleship.jpg', '1', '20', '1', '5.99', '7.99', '5', '1', false);
insert into produits (upc, nom, description, image, id_Categorie, qte_par_paquet, id_type_unite, prix_coutant, prix_vendant, qte_critique, id_fournisseur, si_enleve)
values ('1234567892', 'papa baton', 'bonbon juteux', 'battleship.jpg', '1', '20', '1', '4.99', '9.99', '5', '1', false);
insert into produits (upc, nom, description, image, id_Categorie, qte_par_paquet, id_type_unite, prix_coutant, prix_vendant, qte_critique, id_fournisseur, si_enleve)
values ('1234567893', 'barbe a papa', 'bonbon juteux', 'battleship.jpg', '1', '20', '1', '6.99', '8.99', '5', '1', false);

#insert commande_produits
alter table commande_produits auto_increment = 1;
insert into commande_produits (id_commande, id_produit, qte, prix_par_unite) values ('1', '1', '100', '2.99');
insert into commande_produits (id_commande, id_produit, qte, prix_par_unite) values ('2', '2', '100', '3.99');
insert into commande_produits (id_commande, id_produit, qte, prix_par_unite) values ('1', '3', '100', '4.99');

#insert inventaires
alter table inventaires auto_increment = 1;
insert into inventaires (id_produit, id_entrepot, qte) values ('1', '1', '100');
insert into inventaires (id_produit, id_entrepot, qte) values ('2', '2', '200');
insert into inventaires (id_produit, id_entrepot, qte) values ('1', '2', '100');
insert into inventaires (id_produit, id_entrepot, qte) values ('2', '3', '300');
insert into inventaires (id_produit, id_entrepot, qte) values ('3', '1', '150');

#insert compagnie
alter table compagnie auto_increment = 1;
insert into compagnie (nom_compagnie, adresse, logo) values ('flaming-flamingo', '156 ch. du train', 'battleship.png');
