CREATE TABLE public.asset
(
  asset_id bigint GENERATED ALWAYS AS IDENTITY,
  asset_name character varying,
  PRIMARY KEY(asset_id)
);

CREATE TABLE public.category
(
  category_id bigint GENERATED ALWAYS AS IDENTITY,
  category_name character varying,
  PRIMARY KEY(category_id)
);

CREATE TABLE public.category_asset
(
  asset_id bigint NOT NULL,
  category_id bigint NOT NULL,
  CONSTRAINT fk_asset
      FOREIGN KEY(asset_id)
	  REFERENCES asset(asset_id),
  CONSTRAINT fk_category
      FOREIGN KEY(category_id)
	  REFERENCES category(category_id),

);
