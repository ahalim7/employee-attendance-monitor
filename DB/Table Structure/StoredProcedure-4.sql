USE [HRSchema]
GO

/****** Object:  StoredProcedure [dbo].[SP_INSERT_WORKING_HOURS]    Script Date: 7/17/2018 10:51:04 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[SP_INSERT_WORKING_HOURS] 
	-- Add the parameters for the stored procedure here
	@date nvarchar(MAX), @arrivalTime nvarchar(MAX), @depatureTime nvarchar(MAX),
	@hours int, @minutes int, @seconds int, @employeeID int
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	INSERT INTO [dbo].[EmployeeWorkingHours]
	([date],[arrivalTime],[depatureTime],[hours],[minutes],[seconds],[FK_EmployeeID])
	VALUES(@date, @arrivalTime, @depatureTime, @hours, @minutes, @seconds, @employeeID)

END

GO

