
# Dragstrip Weather API

Small API developed for getting weather metrics at a specific Dragstrip. It gets its data from https://airdensityonline.com and webscrapes it using JSoup.

Currently is not hosted for the public, but I plan for it to be hosted in case anyone needs it. 


## API Reference

#### Get all tracks

```http
  GET /tracks
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `none` | `string` | Returns a list of all tracks and its corresponding Air Density Online URL |

#### Get specific track weather

```http
  GET /weather?{Track Name}
  Example: /weather?trackName=Edinburg%20Motorsports%20Park
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `trackName`      | `string` | **Required**. The name of the track. If the name contains spaces, they must be URL-encoded (e.g., Xtreme Raceway Park becomes Xtreme%20Raceway%20Park). |



## Related

Here is a related project that is most likely going to use this API.

- [Bracket Racing App](https://github.com/Vettel53/BracketRacingFrontend)


## Acknowledgements

 - [Air Density Online](https://airdensityonline.com)
