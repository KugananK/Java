Select c.lastname, f.patient_id from consultants c join fce f
where f.id=c.consultants_id order by lastname