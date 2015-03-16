create database flaming_flamingo;

use flaming_flamingo;

CREATE TABLE IF NOT EXISTS `produits` (
PRIMARY KEY (`id`),
`id` int(10) NOT NULL auto_increment,
`upc` int(12) NOT NULL,
`nom` varchar(50) NOT NULL,
`description` varchar(250) NOT NULL,
`image` varchar(250) NOT NULL,
`categorie_id` int(10) NOT NULL,
`qte_par_paquet` int(10) NOT NULL,
`type_unite` int(10) NOT NULL,
`prix_coutant` decimal(10,2) NOT NULL,
`prix_vendant` decimal(10,2) NOT NULL,
`qte_critique` int(10) NOT NULL,
`fournisseur` int(10) NOT NULL,
`si_enleve` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE =UTF8_bin auto_increment=1;

CREATE TABLE IF NOT EXISTS `commande_produit` (
PRIMARY KEY (`id`),
`id` int(10) NOT NULL auto_increment,
`id_commande` int(10) NOT NULL,
`id_produit` int(10) NOT NULL,
`qte` int(10) NOT NULL,
`prix_par_unite` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE =UTF8_bin auto_increment=1;

CREATE TABLE IF NOT EXISTS `commande` (
PRIMARY KEY (`id`),
`id` int(10) NOT NULL auto_increment,
`id_client` int(10) NOT NULL,
`vendeur` int(10) NOT NULL,    #pourquoi un vendeur ici ???
`date` date NOT NULL,
`prix_total` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE =UTF8_bin auto_increment=1;

CREATE TABLE IF NOT EXISTS `clients` (
PRIMARY KEY (`id`),
`id` int(10) NOT NULL auto_increment,
`entreprise` varchar(50) NOT NULL,
`adresse` varchar(100) NOT NULL,
`telephone` varchar(20) NOT NULL,
`description` varchar(250)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE =UTF8_bin auto_increment=1;

CREATE TABLE IF NOT EXISTS `inventaire` (
PRIMARY KEY (`id`),
`id` int(10) NOT NULL auto_increment,
`id_produit` int(10) NOT NULL,
`id_entrepot` int(10) NOT NULL,
`qte` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE =UTF8_bin auto_increment=1;

CREATE TABLE IF NOT EXISTS `utilisateur` (
PRIMARY KEY (`id`),
`id` int(10) NOT NULL auto_increment,
`nom_utilisateur` varchar(250) NOT NULL,
`mot_de_passe` varchar(50) NOT NULL,
`id_role` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE =UTF8_bin auto_increment=1;

CREATE TABLE IF NOT EXISTS `system` (
`nom` varchar(250) NOT NULL,
`adresse` varchar(250) NOT NULL,
`logo` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE =UTF8_bin auto_increment=1;

CREATE TABLE IF NOT EXISTS `entrepots` (
PRIMARY KEY (`id`),
`id` int(10) NOT NULL auto_increment,
`nom` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE =UTF8_bin auto_increment=1;

CREATE TABLE IF NOT EXISTS `fournisseur` (
PRIMARY KEY (`id`),
`id` int(10) NOT NULL auto_increment,
`nom` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE =UTF8_bin auto_increment=1;

CREATE TABLE IF NOT EXISTS `categorie` (
PRIMARY KEY (`id`),
`id` int(10) NOT NULL auto_increment,
`nom` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE =UTF8_bin auto_increment=1;

CREATE TABLE IF NOT EXISTS `type_unite` (
PRIMARY KEY (`id`),
`id` int(10) NOT NULL auto_increment,
`nom` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE =UTF8_bin auto_increment=1;

CREATE TABLE IF NOT EXISTS `role` (
PRIMARY KEY (`id`),
`id` int(10) NOT NULL auto_increment,
`nom` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE =UTF8_bin auto_increment=1;

alter table `produits` add constraint prod_1 foreign key (`categorie_id`) references produits (`id`),
add constraint prod_2 foreign key (`type_unite`) references produits (`id`),
add constraint prod_3 foreign key (`fournisseur`) references produits (`id`);

alter table commande_produit add constraint cmd_prod_1 foreign key (`id_produit`) references produits (`id`),
add constraint cmd_prod_2 foreign key (`id_commande`) references commande (`id`);

alter table commande add constraint cmd_1 foreign key (`vendeur`) references utilisateur (`id`),
add constraint cmd_2 foreign key (`id_client`) references clients (`id`);


alter table inventaire add constraint inv_1 foreign key (`id_produit`) references produits (`id`),
add constraint inv_2 foreign key (`id_entrepot`) references entrepots (`id`);

alter table utilisateur add constraint util_1 foreign key (`id_role`) references role (`id`);
