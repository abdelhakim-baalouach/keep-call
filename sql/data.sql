insert into public.asset (asset_id, asset_name) values (DEFAULT, 'asset 1');
insert into public.asset (asset_id, asset_name) values (DEFAULT, 'asset 2');
insert into public.asset (asset_id, asset_name) values (DEFAULT, 'asset 3');
insert into public.asset (asset_id, asset_name) values (DEFAULT, 'asset 4');

insert into public.category (category_id, category_name) values (DEFAULT, 'category 1');
insert into public.category (category_id, category_name) values (DEFAULT, 'category 2');
insert into public.category (category_id, category_name) values (DEFAULT, 'category 3');
insert into public.category (category_id, category_name) values (DEFAULT, 'category 4');

insert into public.category_asset (asset_id, category_id) values (1, 1);
insert into public.category_asset (asset_id, category_id) values (1, 2);
insert into public.category_asset (asset_id, category_id) values (1, 3);
insert into public.category_asset (asset_id, category_id) values (1, 4);
insert into public.category_asset (asset_id, category_id) values (2, 2);
insert into public.category_asset (asset_id, category_id) values (2, 3);
insert into public.category_asset (asset_id, category_id) values (2, 4);
insert into public.category_asset (asset_id, category_id) values (3, 3);
insert into public.category_asset (asset_id, category_id) values (3, 4);
insert into public.category_asset (asset_id, category_id) values (4, 4);
