CREATE TABLE IF NOT EXISTS brand (
                                     brand_id INT AUTO_INCREMENT,
                                     brand_name VARCHAR(255) NOT NULL,
    CONSTRAINT "PK_BRAND" PRIMARY KEY (brand_id)
    );

CREATE TABLE IF NOT EXISTS prices (
                                        price_list INT AUTO_INCREMENT,
                                        brand_id INT NOT NULL,
                                        start_date TIMESTAMP NOT NULL,
                                        end_date TIMESTAMP NOT NULL,
                                        product_id INT NOT NULL,
                                        priority SMALLINT NOT NULL,
                                        price FLOAT NOT NULL,
                                        curr VARCHAR(3) NOT NULL,
    CONSTRAINT "PK_BRAND_PRICES" PRIMARY KEY (price_list),
    CONSTRAINT "FK_BRAND" FOREIGN KEY (brand_id) REFERENCES brand (brand_id)
    );